package com.iweb.DAO;

import com.iweb.pojo.Notice;
import com.iweb.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 14:32
 */
public class NoticeDaoImpl implements NoticeDao {
    @Override
    public void insertNotice(Notice notice) {
        String sql = "insert into notice(nid,headline,details) values(?,?,?)";
        try (
                Connection c = DBUtil.getConnection();
                PreparedStatement ps =c.prepareStatement(sql);
                ){
                ps.setInt(1,notice.getNid());
                ps.setString(2,notice.getHeadline());
                ps.setString(3,notice.getDetails());
                ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteNotice(int nid) {
        String sql = "delete from notice where nid=?";
        try(
                Connection c = DBUtil.getConnection();
                PreparedStatement ps = c.prepareStatement(sql);
                ){
            ps.setInt(1,nid);
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateNotice(int nid,String headline, String details) {
        if(headline.equals("null")){
            String sql ="update notice set details=? where nid=?";
            try(
                    Connection c = DBUtil.getConnection();
                    PreparedStatement ps = c.prepareStatement(sql);
                    ){
                ps.setString(1,details);
                ps.setInt(2,nid);
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }else if (details.equals("null")){
            String sql ="update notice set headline=? where nid=?";
            try(
                    Connection c = DBUtil.getConnection();
                    PreparedStatement ps = c.prepareStatement(sql);
            ){
                ps.setString(1,headline);
                ps.setInt(2,nid);
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }else{
            String sql ="update notice set headline=?,details=? where nid=?";
            try(
                    Connection c = DBUtil.getConnection();
                    PreparedStatement ps = c.prepareStatement(sql);
            ){
                ps.setString(1,headline);
                ps.setString(2,details);
                ps.setInt(3,nid);
                ps.execute();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Notice> selectAllNotice() {
        List<Notice> noticeList = new ArrayList<>();
        String sql = "select * from notice";
        try(
                Connection c =DBUtil.getConnection();
                PreparedStatement ps=c.prepareStatement(sql);
                ){
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int nid= rs.getInt("nid");
                String headline = rs.getString("headline");
                String details = rs.getString("details");
                Notice notice = new Notice(nid,headline,details);
                noticeList.add(notice);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return noticeList;
    }

    @Override
    public List<Notice> selectHeadLineLike(String key) {
        List<Notice> noticeList = new ArrayList<>();
        String sql = "select * from notice where headline like concat('%',?,'%')";
        try(
                Connection c =DBUtil.getConnection();
                PreparedStatement ps=c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int nid= rs.getInt("nid");
                String headline = rs.getString("headline");
                String details = rs.getString("details");
                Notice notice = new Notice(nid,headline,details);
                noticeList.add(notice);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return noticeList.size()==0?null:noticeList;
    }

    @Override
    public List<Notice> selectDetailsLike(String key) {
        List<Notice> noticeList = new ArrayList<>();
        String sql = "select * from notice where details like concat('%',?,'%')";
        try(
                Connection c =DBUtil.getConnection();
                PreparedStatement ps=c.prepareStatement(sql);
        ){
            ps.setString(1,key);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int nid= rs.getInt("nid");
                String headline = rs.getString("headline");
                String details = rs.getString("details");
                Notice notice = new Notice(nid,headline,details);
                noticeList.add(notice);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return noticeList.size()==0?null:noticeList;
    }
}
