package com.iweb;

import com.iweb.DAO.*;
import com.iweb.pojo.Employee;
import com.iweb.view.MainView;

/**
 *
 *
 * @author ASUS
 */
public class App {
    public static UserDao userDao = new UserDaoImpl();
    public static JobDao jobDao = new JobDaoImpl();
    public static DepartmentDao departmentDao = new  DepartmentDaoImpl();
    public static NoticeDao noticeDao = new NoticeDaoImpl();
    public static Employee currentEmployee = null;
    public static void main( String[] args ) {
        MainView.mainView();
    }
}
