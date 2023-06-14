package com.iweb.controller;

import com.iweb.App;
import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.*;

/**
 * @author MA
 * @date 2023/6/12 9:51
 */
public class ManagerUserController {
    public static void managerUserController(String key){
        switch (key){
            case "1":
                Print.print("即将跳转到信息查询界面");
                DelayUtil.delay();
                ManagerSearchView.managerSearchView();
                break;
            case "2":
                Print.print("即将跳转到信息修改界面");
                DelayUtil.delay();
                ManagerUpdateView.managerUpdateView();
                break;
            case "3":
                Print.print("即将跳转到信息添加界面");
                DelayUtil.delay();
                ManagerInsertView.managerInsertView();
                break;
            case "4":
                Print.print("即将跳转到信息删除界面");
                DelayUtil.delay();
                ManagerDeleteView.managerDeleteView();
                break;
            case "5":
                Print.print("即将退出登录");
                App.currentEmployee=null;
                DelayUtil.delay();
                MainView.mainView();
                break;
            default:
                Print.print("输入错误请重新输入");
                ManagerUserView.manageUserView();
        }

    }
}
