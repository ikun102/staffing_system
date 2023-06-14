package com.iweb.view;

import com.iweb.controller.ManagerDeleteController;
import com.iweb.service.ManagerDeleteService;
import com.iweb.util.Print;

import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/12 16:16
 */
public class ManagerDeleteView {
    public static Scanner sc=new Scanner(System.in);
    public static void managerDeleteView(){
        System.out.println("=======================================");
        Print.print("请选择要进行的删除操作");
        Print.print("1.删除员工");
        Print.print("2.删除职位");
        Print.print("3.删除部门");
        Print.print("4.删除公告");
        Print.print("5.退出删除操作");
        System.out.println("=======================================");
        String inputDeleteKey=sc.nextLine();
        ManagerDeleteController.managerDeleteController(inputDeleteKey);
    }
    public static void employDeleteView(){
        Print.print("请输入要删除的员工id");
        int inputEid=sc.nextInt();
        sc.nextLine();
        boolean isDelete= ManagerDeleteService.employeeDelete(inputEid);
        if (isDelete){
            Print.print("员工删除成功");
            managerDeleteView();
        }else {
            Print.print("员工删除失败，员工id不存在,请重新输入");
            managerDeleteView();
        }
    }
    public static void jobDeleteView(){
        Print.print("请完整输入要删除的职位名称");
        String inputJName=sc.nextLine();
        boolean isDelete=ManagerDeleteService.jobDelete(inputJName);
        if (isDelete){
            Print.print("职位删除成功");
            managerDeleteView();
        }else {
            System.out.println("职位不存在，请重新输入");
            managerDeleteView();
        }
    }
    public static void departmentDeleteView(){
        Print.print("请完整输入要删除的部门名称");
        String inputDName=sc.nextLine();
        boolean isDelete=ManagerDeleteService.departmentDelete(inputDName);
        if (isDelete){
            Print.print("部门删除成功");
            managerDeleteView();
        }else {
            System.out.println("部门不存在，请重新输入");
            managerDeleteView();
        }
    }
    public static void noticeDeleteView(){
        Print.print("请输入要删除的公告id");
        int inputNid=Integer.parseInt(sc.nextLine());
        boolean isDelete=ManagerDeleteService.noticeDelete(inputNid);
        if (isDelete){
            Print.print("公告删除成功");
            managerDeleteView();
        }else {
            System.out.println("公告不存在，请重新输入");
            managerDeleteView();
        }
    }
}
