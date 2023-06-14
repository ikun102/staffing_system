package com.iweb.view;

import com.iweb.controller.ManagerInsertController;
import com.iweb.pojo.Employee;
import com.iweb.pojo.Notice;
import com.iweb.service.ManagerInsertService;
import com.iweb.service.UserService;
import com.iweb.util.Print;

import java.lang.reflect.ParameterizedType;
import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/12 14:20
 */
public class ManagerInsertView {
    public static Scanner sc=new Scanner(System.in);
    public static void managerInsertView(){
        System.out.println("=======================================");
        Print.print("请选择要进行的信息添加操作");
        Print.print("1.添加员工");
        Print.print("2.添加职位");
        Print.print("3.添加部门");
        Print.print("4.添加公告");
        Print.print("5.退出信息添加界面");
        System.out.println("=======================================");
        String inputInsertKey=sc.nextLine();
        ManagerInsertController.managerInsertController(inputInsertKey);
    }

    public static void insertEmployeeView(){
        Print.print("请输入要添加的员工id");
        int inputEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入要添加的员工密码");
        String inputPassword=sc.nextLine();
        Print.print("请输入要添加的员工是否管理员");
        boolean inputIsManager=sc.nextBoolean();
        sc.nextLine();
        Print.print("请输入要添加的员工姓名");
        String inputEName=sc.nextLine();
        Print.print("请输入要添加的员工身份证号");
        String inputIdNumber=sc.nextLine();
        Print.print("请输入要添加的员工手机号");
        String inputPhone=sc.nextLine();
        Print.print("请输入要添加的员工性别");
        String inputSex=sc.nextLine();
        Print.print("请输入要添加的员工职位");
        String inputJName=sc.nextLine();
        Print.print("请输入要添加的员工部门");
        String inputDName=sc.nextLine();
        Employee registerEmployee=new Employee(inputEid,inputPassword,inputIsManager,inputEName,
                inputIdNumber,inputPhone,inputSex,inputJName,inputDName);
        boolean isRegister=UserService.register(registerEmployee);
        if (isRegister){
            Print.print("用户添加成功");
            managerInsertView();
        }else {
            Print.print("用户id已存在，请重新输入");
            managerInsertView();
        }
    }
    public static void insertJobView(){
        Print.print("请输入要添加的职位id");
        int inputJid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入要添加的职位名称");
        String inputJName=sc.nextLine();
        boolean isInsert= ManagerInsertService.insertJob(inputJid,inputJName);
        if (isInsert){
            Print.print("添加职位成功");
            managerInsertView();
        }else {
            Print.print("输入的职位id或职位名称已经存在，请重新输入");
            managerInsertView();
        }
    }
    public static void insertDepartmentView(){
        Print.print("请输入要添加的部门id");
        int inputDid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入要添加的部门名称");
        String inputDName=sc.nextLine();
        boolean isInsert=ManagerInsertService.insertDepartment(inputDid,inputDName);
        if (isInsert){
            Print.print("添加部门成功");
            managerInsertView();
        }else {
            Print.print("输入的部门id或部门名称已经存在，请重新输入");
            managerInsertView();
        }
    }
    public static void insertNoticeView(){
        Print.print("请输入要添加的公告id");
        int inputNid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入要添加的公告标题");
        String inputHeadline=sc.nextLine();
        Print.print("请输入要添加的公告内容");
        String inputDetails=sc.nextLine();
        boolean isInsert=ManagerInsertService.insertNotice(new Notice(inputNid,inputHeadline,inputDetails));
        if (isInsert){
            Print.print("添加公告成功");
            managerInsertView();
        }else {
            Print.print("输入的公告id已经存在，请重新输入");
            managerInsertView();
        }
    }
}
