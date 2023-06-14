package com.iweb.controller;

import com.iweb.App;
import com.iweb.pojo.Notice;
import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.CommonUserView;
import com.iweb.view.MainView;
import com.iweb.view.ManagerUserView;

import java.util.List;

/**
 * @author MA
 * @date 2023/6/12 8:31
 */
public class CommonUserController {
    public static void commonUserController(String key){
        switch (key){
            case "1":
                Print.print("当前用户信息为");
                App.currentEmployee.show();
                DelayUtil.delay();
                CommonUserView.commonUserView();
                break;
            case "2":
                Print.print("即将跳转到当前用户密码修改界面");
                DelayUtil.delay();
                CommonUserView.commonUserUpdatePasswordView();
                break;
            case "3":
                Print.print("即将跳转到当前用户姓名修改界面");
                DelayUtil.delay();
                CommonUserView.commUserUpdateENameView();
                break;
            case "4":
                Print.print("即将跳转到当前用户身份证号修改界面");
                DelayUtil.delay();
                CommonUserView.commonUpdateIdNumberView();
                break;
            case "5":
                Print.print("即将跳转到当前用户手机号修改界面");
                DelayUtil.delay();
                CommonUserView.commonUpdatePhoneView();
                break;
            case "6":
                Print.print("即将跳转到当前用户性别修改界面");
                DelayUtil.delay();
                CommonUserView.commonUpdateSexView();
                break;
            case "7":
                Print.print("即将进入公告查询页面");
                DelayUtil.delay();
                CommonUserView.searchNoticeView();
                break;
            case "8":
                Print.print("即将退出登录");
                DelayUtil.delay();
                App.currentEmployee=null;
                MainView.mainView();
                break;
            default:
                Print.print("输入错误,请重新输入");
                CommonUserView.commonUserView();
        }
    }
    public static void commonSearchNoticeController(String key){
        switch (key){
            case "1":
                Print.print("即将显示所有公告");
                DelayUtil.delay();
                CommonUserView.allNoticeView();
                break;
            case "2":
                Print.print("即将跳转到公告标题查询页面");
                DelayUtil.delay();
                CommonUserView.searchNoticeHeadlineLikeView();
                break;
            case "3":
                Print.print("即将跳转到公告内容查询页面");
                DelayUtil.delay();
                CommonUserView.searchNoticeDetailsLikeView();
                break;
            case "4":
                Print.print("即将退出公告标题查询页面");
                DelayUtil.delay();
                if(App.currentEmployee.isManager()){
                    ManagerUserView.manageUserView();
                }else {
                    CommonUserView.commonUserView();
                }
                break;
            default:
                Print.print("输入错误请重新输入");
                CommonUserView.searchNoticeView();
        }
    }
}
