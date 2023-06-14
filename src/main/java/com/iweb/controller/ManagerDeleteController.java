package com.iweb.controller;

import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.ManagerDeleteView;
import com.iweb.view.ManagerUserView;

/**
 * @author MA
 * @date 2023/6/12 16:18
 */
public class ManagerDeleteController {
    public static void managerDeleteController(String key){
        switch (key){
            case "1":
                Print.print("即将跳转到员工删除页面");
                DelayUtil.delay();
                ManagerDeleteView.employDeleteView();
                break;
            case "2":
                Print.print("即将跳转到职位删除页面");
                DelayUtil.delay();
                ManagerDeleteView.jobDeleteView();
                break;
            case "3":
                Print.print("即将跳转到部门删除页面");
                DelayUtil.delay();
                ManagerDeleteView.departmentDeleteView();
                break;
            case "4":
                Print.print("即将跳转到公告删除页面");
                DelayUtil.delay();
                ManagerDeleteView.noticeDeleteView();
                break;
            case "5":
                Print.print("即将退出删除页面");
                DelayUtil.delay();
                ManagerUserView.manageUserView();
                break;
            default:
                System.out.println("输入错误，请重新输入");
                ManagerDeleteView.managerDeleteView();

        }

    }
}
