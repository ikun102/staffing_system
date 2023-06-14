package com.iweb.controller;

import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.ManagerInsertView;
import com.iweb.view.ManagerUpdateView;
import com.iweb.view.ManagerUserView;

/**
 * @author MA
 * @date 2023/6/12 14:25
 */
public class ManagerInsertController {
    public static void managerInsertController(String key){
        switch (key){
            case "1":
                Print.print("即将跳转到添加员工界面");
                DelayUtil.delay();
                ManagerInsertView.insertEmployeeView();
                break;
            case "2":
                Print.print("即将跳转到添加职位界面");
                DelayUtil.delay();
                ManagerInsertView.insertJobView();
                break;
            case "3":
                Print.print("即将跳转到添加部门界面");
                DelayUtil.delay();
                ManagerInsertView.insertDepartmentView();
                break;
            case "4":
                Print.print("即将跳转到添加公告界面");
                DelayUtil.delay();
                ManagerInsertView.insertNoticeView();
                break;
            case "5":
                Print.print("即将退出添加信息界面");
                DelayUtil.delay();
                ManagerUserView.manageUserView();
                break;
            default:
                System.out.println("输入有误，请重新输入");
                ManagerInsertView.managerInsertView();
        }
    }
}
