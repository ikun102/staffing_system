package com.iweb.service;

import com.iweb.App;
import com.iweb.pojo.Department;
import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/12 15:22
 */
public class ManagerInsertService {
    public static boolean insertJob(int jid,String jName){
        List<Job> jobs= App.jobDao.selectAllJob();
        for (int i = 0; i < jobs.size(); i++) {
            if ((jobs.get(i).getJid()==jid) || (jobs.get(i).getJName().equals(jName))){
                return false;
            }
        }
        Job job=new Job(jid,jName);
        App.jobDao.insertJob(job);
        return true;
    }
    public static boolean insertDepartment(int did,String dName){
        List<Department> departments =App.departmentDao.selectAllDepartment();
        for (int i = 0; i < departments.size(); i++) {
            if ((departments.get(i).getDid()==did) || (departments.get(i).getDName().equals(dName))){
                return false;
            }
        }
        Department department=new Department(did,dName);
        App.departmentDao.insertDepartment(department);
        return true;
    }
    public static boolean insertNotice(Notice notice){
        List<Notice> notices =App.noticeDao.selectAllNotice();
        for (int i = 0; i < notices.size(); i++) {
            if (notice.getNid()==notice.getNid()){
                return false;
            }
        }
        App.noticeDao.insertNotice(notice);
        return true;
    }
}
