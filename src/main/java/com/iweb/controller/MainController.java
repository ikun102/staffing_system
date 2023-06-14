package com.iweb.controller;

import com.iweb.util.DelayUtil;
import com.iweb.util.Print;
import com.iweb.view.MainView;

/**
 * @author MA
 * @date 2023/6/11 21:36
 */
public class MainController {
    public static void mainController(String key){
        switch (key){
            case "1":
                Print.print("即将进入到登录界面");
                DelayUtil.delay();
                MainView.loginView();
                break;
            case "2":
                Print.print("即将进入到注册界面");
                DelayUtil.delay();
                MainView.registerView();
                break;
            case "3":
                Print.print("即将退出员工管理系统");
                break;
            default:
                Print.print("输入有误，请重新输入");
                MainView.mainView();
        }
    }
}
