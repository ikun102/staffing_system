package com.iweb.controller;

import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.ManagerUpdateView;
import com.iweb.view.ManagerUserView;

/**
 * @author MA
 * @date 2023/6/12 12:30
 */
public class ManagerUpdateController {
    public static void managerUpdateController(String key){
        switch (key){
            case "1":
                Print.print("即将跳转到根据id修改员工密码界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdatePasswordView();
                break;
            case "2":
                Print.print("即将跳转到根据id修改员工姓名界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdateENameView();
                break;
            case "3":
                Print.print("即将跳转到根据id修改员工身份证号界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdateIdNumberView();
                break;
            case "4":
                Print.print("即将跳转到根据id修改员工手机号界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdatePhoneView();
                break;
            case "5":
                Print.print("即将跳转到根据id修改员工性别界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdateSexView();
                break;
            case "6":
                Print.print("即将跳转到根据id修改员工职位界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdateJNameView();
                break;
            case "7":
                Print.print("即将跳转到根据id修改员工部门界面");
                DelayUtil.delay();
                ManagerUpdateView.employeeUpdateDNameView();
                break;
            case "8":
                Print.print("即将跳转到修改职位名称界面");
                DelayUtil.delay();
                ManagerUpdateView.jobUpdateJNameView();
                break;
            case "9":
                Print.print("即将跳转到修改部门名称界面");
                DelayUtil.delay();
                ManagerUpdateView.departmentUpdateDNameView();
                break;
            case "10":
                Print.print("即将跳转到公告修改界面");
                DelayUtil.delay();
                ManagerUpdateView.noticeUpdateView();
                break;
            case "11":
                Print.print("即将退出修改页面");
                DelayUtil.delay();
                ManagerUserView.manageUserView();
                break;
            default:
                System.out.println("输入有误，请重新输入");
                ManagerUpdateView.managerUpdateView();
        }
    }
}
