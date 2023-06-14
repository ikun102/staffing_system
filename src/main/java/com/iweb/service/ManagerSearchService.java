package com.iweb.service;

import com.iweb.App;
import com.iweb.pojo.Department;
import com.iweb.pojo.Employee;
import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;
import com.iweb.view.ManagerSearchView;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/12 9:51
 */
public class ManagerSearchService {
    public static void searchENameLike(String key){
        List<Employee> employees= App.userDao.selectENameLike(key);
        if (employees==null){
            System.out.println("无相关姓名的员工");
        }else {
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).show();
            }
        }
        ManagerSearchView.managerSearchView();
    }
    public static void searchDNameLike(String key){
        List<Employee> employees= App.userDao.selectDNameLike(key);
        if (employees==null){
            System.out.println("无相关部门的员工");
        }else {
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).show();
            }
        }
        ManagerSearchView.managerSearchView();
    }
    public static void searchJNameLike(String key){
        List<Employee> employees= App.userDao.selectJNameLike(key);
        if (employees==null){
            System.out.println("无相关职位的员工");
        }else {
            for (int i = 0; i < employees.size(); i++) {
                employees.get(i).show();
            }
        }
        ManagerSearchView.managerSearchView();
    }
    public static void searchSexLike(String key){
        List<Employee> employees= App.userDao.selectSexLike(key);
        if (!(key.equals("男")) && !(key.equals("女"))){
            System.out.println("性别输入有误，请重新输入");
            ManagerSearchView.searchSexLikeView();
        }else {
            if (employees==null){
                System.out.println("无相关性别的员工");
            }else {
                for (int i = 0; i < employees.size(); i++) {
                    employees.get(i).show();
                }
            }
        }
        ManagerSearchView.managerSearchView();
    }
    public static void searchDepartmentDNameLike(String key){
        List<Department> departments=App.departmentDao.selectDNameLike(key);
        if (departments==null){
            System.out.println("未找到相关部门信息");
        }else {
            for (int i = 0; i < departments.size(); i++) {
                departments.get(i).show();
            }
        }
        ManagerSearchView.managerSearchView();
    }
    public static void searchJobJNameLike(String key){
        List<Job> jobs=App.jobDao.selectJNameLike(key);
        if (jobs==null){
            System.out.println("未找到相关职位信息");
        }else {
            for (int i = 0; i < jobs.size(); i++) {
                jobs.get(i).show();
            }
        }
        ManagerSearchView.managerSearchView();
    }

}
