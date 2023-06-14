package com.iweb;

import static org.junit.Assert.assertTrue;

import com.iweb.DAO.*;
import com.iweb.pojo.Department;
import com.iweb.pojo.Employee;
import com.iweb.pojo.Job;
import com.iweb.pojo.Notice;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    NoticeDao dao1;
    JobDao dao2;
    DepartmentDao dao3;
    UserDao dao4;
    @Before
    public void init(){
        dao1=new NoticeDaoImpl();
        dao2=new JobDaoImpl();
        dao3=new DepartmentDaoImpl();
        dao4=new UserDaoImpl();
    }
    @Test
    public void test1()
    {
//        List<Notice> notices= dao1.selectAllNotice();
//        for (int i = 0; i < notices.size(); i++) {
//            System.out.println(notices.get(i));
//        }
//        List<Notice> notices= dao1.selectDetailsLike("下班");
//        System.out.println(notices);
//        dao1.insertNotice(new Notice(2306111,"吃饭通知","该吃饭了"));
//        dao1.updateNotice(2306111,null,"不吃饭了");
//        dao1.updateNotice(2306111,"干饭通知",null);
//        dao1.deleteNotice(2306111);
    }

    @Test
    public void test2(){
//       List<Job> jobs= dao.selectAllJob();
// //       List<Job> jobs = dao.selectJNameLike("保");
//        for (int i = 0; i < jobs.size(); i++) {
//            System.out.println(jobs.get(i));
//        }
//        dao.insertJob(new Job(350,"嘀嘀嘀"));
//        dao.updateJName(350,"第一");
//        dao2.deleteJob("第一");
    }

    @Test
    public void test3(){
//        List<Department> departments= dao3.selectAllDepartment();
//        for (int i = 0; i < departments.size(); i++) {
//            System.out.println(departments.get(i));
//        }
//        List<Department> departmentList= dao3.selectDNameLike("事");
//        for (int i = 0; i < departmentList.size(); i++) {
//            System.out.println(departmentList.get(i));
//        }
//        dao3.insertDepartment(new Department(250,"嘀嘀嘀"));
//        dao3.updateDName(250,"第一");
        dao3.deleteDepartment("第一");
    }

    @Test
    public void test4(){
        Employee employee= dao4.selectSpecifiedEmployee(123456);
        System.out.println(employee);

//        List<Employee> employees=dao4.selectAllEmployee();
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

//        List<Employee> employees=dao4.selectENameLike("徐");
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

//        List<Employee> employees=dao4.selectJNameLike("测");
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

//        List<Employee> employees=dao4.selectDNameLike("发");
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

//        List<Employee> employees=dao4.selectSexLike("男");
//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }
//        dao4.updateEName(123,"坤");
//        dao4.updatePassword(123,"123456789");
//        dao4.updatePhone(123,"987654321");
//        dao4.updateIdNumber(123,"320125");
//        dao4.updateSex(123,"女");
//        dao4.updateJName(123,"你干嘛");
//        dao4.updateDName(123,"哎呦");
    //    dao4.insertEmployee(new Employee(123546,"a123456",false,"坤坤","32012555555","13122222","男","测测试","测测"));
//        dao4.deleteEmployee(123);
//        dao4.deleteEmployee(123546);
    }


}
