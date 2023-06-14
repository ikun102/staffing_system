package com.iweb.view;

import com.iweb.controller.ManagerUpdateController;
import com.iweb.service.ManagerUpdateService;
import com.iweb.util.Print;

import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/12 12:17
 */
public class ManagerUpdateView {
    public static Scanner sc= new Scanner(System.in);
    public static void managerUpdateView(){
        System.out.println("=======================================");
        Print.print("请选择要进行的查询操作");
        Print.print("1.根据id修改指定员工密码");
        Print.print("2.根据id修改指定员工姓名");
        Print.print("3.根据id修改指定员工身份证号");
        Print.print("4.根据id修改指定员工手机号");
        Print.print("5.根据id修改指定员工性别");
        Print.print("6.根据id修改指定员工职位");
        Print.print("7.根据id修改指定员工部门");
        Print.print("8.修改职位名称");
        Print.print("9.修改部门名称");
        Print.print("10.修改公告");
        Print.print("11.退出修改页面");
        System.out.println("=======================================");
        String inputUpdateKey = sc.nextLine();
        ManagerUpdateController.managerUpdateController(inputUpdateKey);
    }

    public static void employeeUpdatePasswordView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的密码");
        String inputUpdatePassword=sc.nextLine();
        ManagerUpdateService.updateEmployeePassword(inputUpdateEid,inputUpdatePassword);
    }
    public static void employeeUpdateENameView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工姓名");
        String inputUpdateEName=sc.nextLine();
        ManagerUpdateService.updateEmployeeEName(inputUpdateEid,inputUpdateEName);
    }
    public static void employeeUpdateIdNumberView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工身份证号");
        String inputUpdateIdNumber=sc.nextLine();
        ManagerUpdateService.updateEmployeeIdNumber(inputUpdateEid,inputUpdateIdNumber);
    }
    public static void employeeUpdatePhoneView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工手机号");
        String inputUpdatePhone=sc.nextLine();
        ManagerUpdateService.updateEmployeePhone(inputUpdateEid,inputUpdatePhone);
    }
    public static void employeeUpdateSexView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工性别");
        String inputUpdateSex=sc.nextLine();
        ManagerUpdateService.updateEmployeeSex(inputUpdateEid,inputUpdateSex);
    }
    public static void employeeUpdateJNameView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工职位名字");
        String inputUpdateJName=sc.nextLine();
        ManagerUpdateService.updateEmployeeJName(inputUpdateEid,inputUpdateJName);
    }
    public static void employeeUpdateDNameView(){
        Print.print("请输入要修改密码的员工id");
        int inputUpdateEid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的员工部门名字");
        String inputUpdateDName=sc.nextLine();
        ManagerUpdateService.updateEmployeeDName(inputUpdateEid,inputUpdateDName);
    }
    public static void jobUpdateJNameView(){
        Print.print("请输入要修改的职位id");
        int inputUpdateJid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的职位名字");
        String inputUpdateJName=sc.nextLine();
        ManagerUpdateService.updateJobJName(inputUpdateJid,inputUpdateJName);
    }
    public static void departmentUpdateDNameView(){
        Print.print("请输入要修改的部门id");
        int inputUpdateDid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的职位名字");
        String inputUpdateDName=sc.nextLine();
        ManagerUpdateService.updateDepartmentName(inputUpdateDid,inputUpdateDName);
    }
    public static void noticeUpdateView(){
        Print.print("请输入要修改的公告id");
        int inputNid=sc.nextInt();
        sc.nextLine();
        Print.print("请输入修改后的公告标题，若不改标题则输入null");
        String inputHeadline=sc.nextLine();
        Print.print("请输入修改后的公告内容，若不改标题则输入null");
        String inputDetails=sc.nextLine();
        ManagerUpdateService.updateNotice(inputNid,inputHeadline,inputDetails);
    }
}
