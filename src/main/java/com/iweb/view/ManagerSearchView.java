package com.iweb.view;

import com.iweb.App;
import com.iweb.controller.ManagerSearchController;
import com.iweb.pojo.Department;
import com.iweb.pojo.Employee;
import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;
import com.iweb.service.ManagerSearchService;
import com.iweb.util.Print;

import java.util.List;
import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/12 10:32
 */
public class ManagerSearchView {
    public static Scanner sc = new Scanner(System.in);
    public static void managerSearchView(){
        System.out.println("=======================================");
        Print.print("请选择要进行的查询操作");
        Print.print("1.查看本人信息");
        Print.print("2.查看所有员工信息");
        Print.print("3.根据员工员工姓名查询员工信息");
        Print.print("4.根据员工员工部门查询员工信息");
        Print.print("5.根据员工员工职位查询员工信息");
        Print.print("6.根据员工员工性别查询员工信息");
        Print.print("7.查看所有部门");
        Print.print("8.根据部门名字模糊查询部门");
        Print.print("9.查看所有职位");
        Print.print("10.根据职位名字模糊查询职位");
        Print.print("11.公告查询");
        Print.print("12.退出查询界面");
        System.out.println("=======================================");
        String inputManagerSearchKey=sc.nextLine();
        ManagerSearchController.managerSearchController(inputManagerSearchKey);
    }

    public static void searchAllEmployeeView(){
        List<Employee> employees= App.userDao.selectAllEmployee();
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).show();
        }
        ManagerSearchView.managerSearchView();
    }

    public static void searchENameLikeView(){
        Print.print("请输入要模糊查询的员工姓名关键字");
        String inputSearchENameKey=sc.nextLine();
        ManagerSearchService.searchENameLike(inputSearchENameKey);
    }

    public static void searchEmployeeDNameLikeView(){
        Print.print("请输入要模糊查询的员工部门关键字");
        String inputSearchDNameKey=sc.nextLine();
        ManagerSearchService.searchDNameLike(inputSearchDNameKey);
    }

    public static void searchEmployeeJNameLikeView(){
        Print.print("请输入要模糊查询的员工职位关键字");
        String inputSearchJNameKey=sc.nextLine();
        ManagerSearchService.searchJNameLike(inputSearchJNameKey);
    }

    public static void searchSexLikeView(){
        Print.print("请输入要模糊查询的员工性别关键字");
        String inputSearchSexKey=sc.nextLine();
        ManagerSearchService.searchSexLike(inputSearchSexKey);
    }

    public static void searchAllDepartmentView(){
        List<Department> departments = App.departmentDao.selectAllDepartment();
        for (int i = 0; i < departments.size(); i++) {
            departments.get(i).show();
        }
        managerSearchView();
    }

    public static void searchDepartmentDNameLikeView(){
        Print.print("请输入要模糊查询的部门关键字");
        String inputSearchDepartmentDNameKey=sc.nextLine();
        ManagerSearchService.searchDepartmentDNameLike(inputSearchDepartmentDNameKey);
    }

    public static void searchAllJobView(){
        List<Job> jobs = App.jobDao.selectAllJob();
        for (int i = 0; i < jobs.size(); i++) {
            jobs.get(i).show();
        }
        managerSearchView();
    }
    public static void searchJobJNameLikeView(){
        Print.print("请输入要模糊查询的职位关键字");
        String inputSearchJobJNameKey=sc.nextLine();
        ManagerSearchService.searchJobJNameLike(inputSearchJobJNameKey);
    }



}
