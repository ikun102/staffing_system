package com.iweb.service;

import com.iweb.App;
import com.iweb.util.Print;
import com.iweb.view.CommonUserView;

/**
 * @author MA
 * @date 2023/6/12 8:47
 */
public class CommonUserService {
    public static void updateCommonUserPassword(String key){
        App.userDao.updatePassword(App.currentEmployee.getEid(),key);
        App.currentEmployee.setPassword(key);
        Print.print("用户密码修改完成，返回用户功能选择页面");
        CommonUserView.commonUserView();
    }
    public static void updateCommonUserEName(String key){
        App.userDao.updateEName(App.currentEmployee.getEid(),key);
        App.currentEmployee.setEName(key);
        Print.print("用户姓名修改完成，返回用户功能选择页面");
        CommonUserView.commonUserView();
    }
    public static void updateCommonUserIdNumber(String key){
        App.userDao.updateIdNumber(App.currentEmployee.getEid(),key);
        App.currentEmployee.setIdNumber(key);
        Print.print("用户身份证号修改完成，返回用户功能选择页面");
        CommonUserView.commonUserView();
    }
    public static void updateCommonUserPhone(String key){
        App.userDao.updatePhone(App.currentEmployee.getEid(),key);
        App.currentEmployee.setPhone(key);
        Print.print("用户手机号修改完成，返回用户功能选择页面");
        CommonUserView.commonUserView();
    }
    public static void updateCommonUserSex(String key){
        if (!(key.equals("男")) && !(key.equals("女"))){
            Print.print("性别输入有误请重新输入");
            CommonUserView.commonUpdateSexView();
        }else {
            App.userDao.updateSex(App.currentEmployee.getEid(),key);
            App.currentEmployee.setPhone(key);
            Print.print("用户手机号修改完成，返回用户功能选择页面");
            CommonUserView.commonUserView();
        }
    }
}
