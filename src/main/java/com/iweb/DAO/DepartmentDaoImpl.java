package com.iweb.DAO;

import com.iweb.pojo.Department;
import com.iweb.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 17:24
 */
public class DepartmentDaoImpl implements DepartmentDao {
    @Override
    public List<Department> selectAllDepartment() {
        List<Department> departmentList = new ArrayList<>();
        String sql = "select * from department";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                int did = rs.getInt("did");
                String dName = rs.getString("dName");
                Department department=new Department(did,dName);
                departmentList.add(department);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return departmentList;
    }

    @Override
    public List<Department> selectDNameLike(String key) {
        List<Department> departmentList = new ArrayList<>();
        String sql = "select * from department where dName like concat('%',?,'%')";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                int did = rs.getInt("did");
                String dName = rs.getString("dName");
                Department department=new Department(did,dName);
                departmentList.add(department);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return departmentList.size()==0?null:departmentList;
    }

    @Override
    public void updateDName(int did, String dName) {
        String updateDepartment ="update department set dName=? where did=?";
        String updateEmployee = "update employee set dName=? where dName=(select dName from department where did=?)";
        try (
                Connection c=DBUtil.getConnection();
                PreparedStatement upDep = c.prepareStatement(updateDepartment);
                PreparedStatement upEmp = c.prepareStatement(updateEmployee);
        ){
            upDep.setString(1,dName);
            upDep.setInt(2,did);
            upEmp.setString(1,dName);
            upEmp.setInt(2,did);
            upEmp.execute();
            upDep.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteDepartment(String dName) {
        String deleteDepartment = "delete from department where dName=?";
        String updateEmp = "update employee set dName='待分配部门' where dName=?";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement deDep = c.prepareStatement(deleteDepartment);
                PreparedStatement upEmp = c.prepareStatement(updateEmp);
        ){
            deDep.setString(1,dName);
            upEmp.setString(1,dName);
            deDep.execute();
            upEmp.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertDepartment(Department department) {
        String sql = "insert into department(did,dName) values(?,?)";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setInt(1,department.getDid());
            ps.setString(2,department.getDName());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
