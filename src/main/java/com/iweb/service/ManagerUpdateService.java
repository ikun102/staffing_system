package com.iweb.service;

import com.iweb.App;
import com.iweb.view.ManagerUpdateView;

/**
 * @author MA
 * @date 2023/6/12 12:33
 */
public class ManagerUpdateService {
    public static void updateEmployeePassword(int eid,String password){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updatePassword(eid,password);
            App.currentEmployee.setPassword(password);
        }else {
            App.userDao.updatePassword(eid,password);
        }
        System.out.println("用户密码修改成功");
        ManagerUpdateView.managerUpdateView();
    }

    public static void updateEmployeeEName(int eid,String eName){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updateEName(eid,eName);
            App.currentEmployee.setEName(eName);
        }else {
            App.userDao.updateEName(eid,eName);
        }
        System.out.println("用户姓名修改成功");
        ManagerUpdateView.managerUpdateView();
    }

    public static void updateEmployeeIdNumber(int eid,String idNumber){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updateIdNumber(eid,idNumber);
            App.currentEmployee.setIdNumber(idNumber);
        }else {
            App.userDao.updateIdNumber(eid,idNumber);
        }
        System.out.println("用户身份证号修改成功");
        ManagerUpdateView.managerUpdateView();
    }

    public static void updateEmployeePhone(int eid,String phone){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updatePhone(eid,phone);
            App.currentEmployee.setPhone(phone);
        }else {
            App.userDao.updatePhone(eid,phone);
        }
        System.out.println("用户手机号修改成功");
        ManagerUpdateView.managerUpdateView();
    }
    public static void updateEmployeeSex(int eid,String sex){
        if (!(sex.equals("男")) && !(sex.equals("女"))){
            System.out.println("输入性别有误，请重新输入");
            ManagerUpdateView.employeeUpdateSexView();
        }else {
            if (eid==App.currentEmployee.getEid()){
                App.userDao.updateSex(eid,sex);
                App.currentEmployee.setSex(sex);
            }else {
                App.userDao.updateSex(eid,sex);
            }
            System.out.println("用户性别修改成功");
            ManagerUpdateView.managerUpdateView();
        }

    }
    public static void updateEmployeeJName(int eid,String jName){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updateJName(eid,jName);
            App.currentEmployee.setJName(jName);
        }else {
            App.userDao.updateJName(eid,jName);
        }
        System.out.println("用户职位修改成功");
        ManagerUpdateView.managerUpdateView();
    }
    public static void updateEmployeeDName(int eid,String dName){
        if (eid==App.currentEmployee.getEid()){
            App.userDao.updateDName(eid,dName);
            App.currentEmployee.setDName(dName);
        }else {
            App.userDao.updateDName(eid,dName);
        }
        System.out.println("用户部门修改成功");
        ManagerUpdateView.managerUpdateView();
    }
    public static void updateJobJName(int jid,String jName){
        App.jobDao.updateJName(jid,jName);
        App.currentEmployee=App.userDao.selectSpecifiedEmployee(App.currentEmployee.getEid());
        System.out.println("职位修改成功");
        ManagerUpdateView.managerUpdateView();
    }
    public static void updateDepartmentName(int did,String dName){
        App.departmentDao.updateDName(did,dName);
        App.currentEmployee=App.userDao.selectSpecifiedEmployee(App.currentEmployee.getEid());
        System.out.println("部门修改成功");
        ManagerUpdateView.managerUpdateView();
    }
    public static void updateNotice(int nid,String headline,String details){
        App.noticeDao.updateNotice(nid,headline,details);
        System.out.println("公告修改完成");
        ManagerUpdateView.managerUpdateView();
    }
}
