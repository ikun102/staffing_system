package com.iweb.DAO;

import com.iweb.pojo.Employee;
import com.iweb.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 20:25
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Employee selectSpecifiedEmployee(int eid) {
        Employee employee = new Employee();
        String sql = "select * from employee where eid=?";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setInt(1,eid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                employee.setEid(eid);
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employee.getEid()==0?null:employee;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employee ";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt("eid"));
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
                employeeList.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void updateEName(int eid, String eName) {
        String sql = "update employee set eName=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setString(1,eName);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void updatePassword(int eid, String password) {
        String sql = "update employee set password=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,password);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateIdNumber(int eid, String idNumber) {
        String sql = "update employee set idNumber=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,idNumber);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updatePhone(int eid, String phone) {
        String sql = "update employee set phone=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,phone);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateJName(int eid, String jName) {
        String sql = "update employee set jName=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,jName);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateDName(int eid, String dName) {
        String sql = "update employee set dName=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,dName);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateSex(int eid, String sex) {
        String sql = "update employee set sex=? where eid=?";
        try(
                Connection c= DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,sex);
            ps.setInt(2,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> selectENameLike(String key) {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employee where eName like concat('%',?,'%') ";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt("eid"));
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
                employeeList.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeList.size()==0?null:employeeList;
    }

    @Override
    public List<Employee> selectJNameLike(String key) {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employee where jName like concat('%',?,'%') ";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt("eid"));
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
                employeeList.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeList.size()==0?null:employeeList;
    }

    @Override
    public List<Employee> selectDNameLike(String key) {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employee where dName like concat('%',?,'%') ";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt("eid"));
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
                employeeList.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeList.size()==0?null:employeeList;
    }

    @Override
    public List<Employee> selectSexLike(String key) {
        List<Employee> employeeList = new ArrayList<>();
        String sql = "select * from employee where sex=? ";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee employee = new Employee();
                employee.setEid(rs.getInt("eid"));
                employee.setEName(rs.getString("eName"));
                employee.setPassword(rs.getNString("password"));
                employee.setIdNumber(rs.getString("idNumber"));
                employee.setPhone(rs.getString("phone"));
                employee.setManager(rs.getBoolean("isManager"));
                employee.setSex(rs.getString("sex"));
                employee.setJName(rs.getString("jName"));
                employee.setDName(rs.getString("dName"));
                employeeList.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return employeeList.size()==0?null:employeeList;
    }

    @Override
    public void deleteEmployee(int eid) {
        String sql = "delete from employee where eid=?";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setInt(1,eid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertEmployee(Employee employee) {
        String sql = "insert into employee(eid,password,isManager,eName,idNumber,phone,sex,jName,dName) values(?,?,?,?,?,?,?,?,?)";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setInt(1,employee.getEid());
            ps.setString(2,employee.getPassword());
            ps.setBoolean(3,employee.isManager());
            ps.setString(4,employee.getEName());
            ps.setString(5,employee.getIdNumber());
            ps.setString(6,employee.getPhone());
            ps.setString(7,employee.getSex());
            ps.setString(8,employee.getJName());
            ps.setString(9,employee.getDName());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
