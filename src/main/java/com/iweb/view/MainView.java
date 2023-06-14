package com.iweb.view;

import com.iweb.App;
import com.iweb.controller.MainController;
import com.iweb.pojo.Employee;
import com.iweb.service.UserService;
import com.iweb.util.Print;
import com.iweb.util.StringUtil;


import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/11 14:02
 */
public class MainView {
    public static Scanner sc = new Scanner(System.in);
    public static void mainView(){
        System.out.println("=======================================");
        Print.print("欢迎来到员工管理系统");
        Print.print("请选择你要进行的操作");
        Print.print("1.登录");
        Print.print("2.注册");
        Print.print("3.退出系统");
        System.out.println("=======================================");
        String inputMainKey = sc.nextLine();
        MainController.mainController(inputMainKey);
    }
    public static void loginView(){
        Print.print("请输入登录的员工id:");
        int inputEid= sc.nextInt();
        Print.print("请输入您的密码:");
        sc.nextLine();
        String inputPassword = sc.nextLine();
        //获取验证码:如果发现验证码不对 则直接重新登录
        String confirmCode = StringUtil.getRandomStr(4);
        Print.print("验证码为:"+confirmCode+",请输入验证码进行验证,验证码不区分大小写");
        String inputConfirmCode = sc.nextLine();
        if(confirmCode.equalsIgnoreCase(inputConfirmCode)){
        // 验证码验证通过,则进行用户id和密码验证
            Print.print("验证码通过,正在验证用户名和密码,请稍后");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            boolean isLogin = UserService.login(inputEid,inputPassword);
            //如果登录成功,则跳转到普通用户页面或者管理员页面
            if(isLogin){
                boolean isManager=App.currentEmployee.isManager();
                if(isManager){
                    ManagerUserView.manageUserView();
                }else {
                    CommonUserView.commonUserView();
                }
            }else {
                //否则 返回登录页面
                System.out.println("用户名或密码错误，请重新输入");
                loginView();
            }

        }else {
            Print.print("验证码输入有误,请重新输入!");
            loginView();
        }
    }

    public static void registerView(){
        Print.print("请输入员工id");
        int inputEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入员工密码");
        String inputPassword=sc.nextLine();
        Print.print("请输入员是否为管理员");
        boolean inputIsManager=sc.nextBoolean();
        sc.nextLine();
        Print.print("请输入员工姓名");
        String inputEName=sc.nextLine();
        Print.print("请输入员工身份证号");
        String inputIdNumber=sc.nextLine();
        Print.print("请输入员工手机号");
        String inputPhone=sc.nextLine();
        Print.print("请输入员工性别");
        String inputSex=sc.nextLine();
        Print.print("请输入员工职位");
        String inputJName=sc.nextLine();
        Print.print("请输入员工部门");
        String inputDName=sc.nextLine();
        Employee registerEmployee=new Employee(inputEid,inputPassword,inputIsManager,inputEName,inputIdNumber,inputPhone,inputSex,inputJName,inputDName);
        boolean isRegister=UserService.register(registerEmployee);
        if (isRegister){
            Print.print("注册成功，返回主页面");
            mainView();
        }else {
            Print.print("员工id已存在，请重新输入");
            registerView();
        }
    }
}
