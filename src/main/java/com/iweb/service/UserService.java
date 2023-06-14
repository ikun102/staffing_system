package com.iweb.service;

import com.iweb.App;
import com.iweb.DAO.*;
import com.iweb.pojo.Employee;
import com.iweb.util.Print;
import com.iweb.view.MainView;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/11 21:46
 */
public class UserService {
    public static boolean login(int inputEid,String inputPassword){
        boolean flag=false;
        List<Employee> employees = App.userDao.selectAllEmployee();
        loop:
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEid()==inputEid && employees.get(i).getPassword().equals(inputPassword)){
                flag=true;
                App.currentEmployee=employees.get(i);
                break loop;
            }
        }
        return flag;
    }
    public static boolean register(Employee registerEmployee){
        List<Employee> employees = App.userDao.selectAllEmployee();
        loop:
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEid()==registerEmployee.getEid()){
                return false;
            }
        }
        if(App.userDao.selectSexLike(registerEmployee.getSex())==null){
            Print.print("输入性别有误，请重新输入");
            MainView.registerView();
        }
        if (App.jobDao.selectJNameLike(registerEmployee.getJName())==null){
            Print.print("输入职位不存在，请重新输入");
            MainView.registerView();
        }
        if (App.departmentDao.selectDNameLike(registerEmployee.getDName())==null){
            Print.print("输入部门不存在，请重新输入");
            MainView.registerView();
        }
        App.userDao.insertEmployee(registerEmployee);
        return true;
    }
}
