package com.iweb.DAO;

import com.iweb.pojo.Job;
import com.iweb.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 15:50
 */
public class JobDaoImpl implements JobDao {
    @Override
    public List<Job> selectAllJob() {
        List<Job> jobList = new ArrayList<>();
        String sql = "select * from job";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                int jid = rs.getInt("jid");
                String jName = rs.getString("jName");
                Job job=new Job(jid,jName);
                jobList.add(job);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return jobList;
    }

    @Override
    public List<Job> selectJNameLike(String key) {
        List<Job> jobList = new ArrayList<>();
        String sql = "select * from job where jName like concat('%',?,'%')";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                int jid = rs.getInt("jid");
                String jName = rs.getString("jName");
                Job job=new Job(jid,jName);
                jobList.add(job);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return jobList.size()==0?null:jobList;
    }

    @Override
    public void updateJName(int jid, String jName) {
        String updateJob ="update job set jName=? where jid=?";
        String updateEmployee = "update employee set jName=? where jName=(select jName from job where jid=?)";
        try (
                Connection c=DBUtil.getConnection();
                PreparedStatement upJob = c.prepareStatement(updateJob);
                PreparedStatement upEmp = c.prepareStatement(updateEmployee);
                ){
            upJob.setString(1,jName);
            upJob.setInt(2,jid);
            upEmp.setString(1,jName);
            upEmp.setInt(2,jid);
            upEmp.execute();
            upJob.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public void deleteJob(String jName) {
        String deleteJob = "delete from job where jName=?";
        String updateEmp = "update employee set jName='待分配职位' where jName=?";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement deJob = c.prepareStatement(deleteJob);
                PreparedStatement upEmp = c.prepareStatement(updateEmp);
                ){
            deJob.setString(1,jName);
            upEmp.setString(1,jName);
            deJob.execute();
            upEmp.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void insertJob(Job job) {
        String sql = "insert into job(jid,jName) values(?,?)";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setInt(1,job.getJid());
            ps.setString(2,job.getJName());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
