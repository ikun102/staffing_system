package com.iweb.controller;

import com.iweb.App;
import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.CommonUserView;
import com.iweb.view.ManagerSearchView;
import com.iweb.view.ManagerUserView;

/**
 * @author MA
 * @date 2023/6/12 10:34
 */
public class ManagerSearchController {
    public static void managerSearchController(String key){
        switch (key){
            case "1":
                Print.print("当前用户信息为:");
                App.currentEmployee.show();
                ManagerSearchView.managerSearchView();
                break;
            case "2":
                Print.print("以下是所有员工信息:");
                DelayUtil.delay();
                ManagerSearchView.searchAllEmployeeView();
                break;
            case "3":
                Print.print("即将进入根据员工姓名查询员工信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchENameLikeView();
                break;
            case "4":
                Print.print("即将进入根据员工部门查询员工信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchEmployeeDNameLikeView();
                break;
            case "5":
                Print.print("即将进入根据员工职位查询员工信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchEmployeeJNameLikeView();
                break;
            case "6":
                Print.print("即将进入根据员工性别查询员工信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchSexLikeView();
                break;
            case "7":
                Print.print("以下是所有部门信息:");
                DelayUtil.delay();
                ManagerSearchView.searchAllDepartmentView();
                break;
            case "8":
                Print.print("即将进入根据部门名字查询部门信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchDepartmentDNameLikeView();
                break;
            case "9":
                Print.print("以下是所有职位信息:");
                DelayUtil.delay();
                ManagerSearchView.searchAllJobView();
                break;
            case "10":
                Print.print("即将进入根据职位名字查询职位信息界面");
                DelayUtil.delay();
                ManagerSearchView.searchJobJNameLikeView();
                break;
            case "11":
                Print.print("即将进入公告查询界面");
                DelayUtil.delay();
                CommonUserView.searchNoticeView();
                break;
            case "12":
                Print.print("即将退出查询界面");
                DelayUtil.delay();
                ManagerUserView.manageUserView();
                break;
            default:
                Print.print("输入错误，请重新输入");
                ManagerSearchView.managerSearchView();


        }
    }
}
