package com.iweb.view;

import com.iweb.App;
import com.iweb.controller.ManagerUserController;
import com.iweb.util.Print;

import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/11 21:54
 */
public class ManagerUserView {
    public static Scanner sc = new Scanner(System.in);
    public static void manageUserView(){
        System.out.println("=======================================");
        Print.print("尊贵的管理员"+ App.currentEmployee.getEName()+"欢迎来到管理员用户界面，请选择你要进行的操作：");
        Print.print("1.信息查询");
        Print.print("2.信息修改");
        Print.print("3.信息添加");
        Print.print("4.信息删除");
        Print.print("5.退出登录");
        System.out.println("=======================================");
        String inputManagerUserKey=sc.nextLine();
        ManagerUserController.managerUserController(inputManagerUserKey);
    }


}
