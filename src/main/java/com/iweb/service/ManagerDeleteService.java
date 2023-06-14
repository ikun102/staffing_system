package com.iweb.service;

import com.iweb.App;
import com.iweb.pojo.Department;
import com.iweb.pojo.Employee;
import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/12 16:18
 */
public class ManagerDeleteService {

    public static boolean employeeDelete(int eid){
        Employee employee = App.userDao.selectSpecifiedEmployee(eid);
        if (employee==null){
            return false;
        }
        App.userDao.deleteEmployee(eid);
        return true;
    }
    public static boolean jobDelete(String jName){
        List<Job> jobs = App.jobDao.selectJNameLike(jName);
        if(jobs==null){
            return false;
        }else {
            App.jobDao.deleteJob(jName);
            return true;
        }
    }
    public static boolean departmentDelete(String dName){
        List<Department> departments=App.departmentDao.selectDNameLike(dName);
        if (departments==null){
            return false;
        }else {
            App.departmentDao.deleteDepartment(dName);
            return true;
        }
    }
    public static boolean noticeDelete(int nid){
        List<Notice> notices=App.noticeDao.selectAllNotice();
        for (int i = 0; i < notices.size(); i++) {
            if (notices.get(i).getNid()==nid){
                App.noticeDao.deleteNotice(nid);
                return true;
            }
        }
        return false;
    }
}
