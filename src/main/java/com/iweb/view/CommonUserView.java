package com.iweb.view;

import com.iweb.App;
import com.iweb.controller.CommonUserController;
import com.iweb.pojo.Notice;
import com.iweb.service.CommonUserService;
import com.iweb.util.Print;

import java.util.List;
import java.util.Scanner;

/**
 * @author MA
 * @date 2023/6/11 21:54
 */
public class CommonUserView {
    public static Scanner sc = new Scanner(System.in);
    public static void commonUserView(){
        System.out.println("=======================================");
        Print.print("用户"+ App.currentEmployee.getEName()+"欢迎来到普通用户界面，请选择你要进行的操作：");
        Print.print("1.查看当前用户信息");
        Print.print("2.修改密码");
        Print.print("3.修改姓名");
        Print.print("4.修改身份证号");
        Print.print("5.修改手机号");
        Print.print("6.修改性别");
        Print.print("7.查询公告");
        Print.print("8.退出登录");
        System.out.println("=======================================");
        String inputCommonUserKey=sc.nextLine();
        CommonUserController.commonUserController(inputCommonUserKey);
    }

    public static void commonUserUpdatePasswordView(){
        Print.print("请输入你要修改的密码：");
        String updatePassword=sc.nextLine();
        CommonUserService.updateCommonUserPassword(updatePassword);
    }
    public static void commUserUpdateENameView(){
        Print.print("请输入你要修改的用户名");
        String updateEName=sc.nextLine();
        CommonUserService.updateCommonUserEName(updateEName);
    }
    public static void commonUpdateIdNumberView(){
        Print.print("请输入你要修改的身份证号");
        String updateIdNumber=sc.nextLine();
        CommonUserService.updateCommonUserIdNumber(updateIdNumber);
    }
    public static void commonUpdatePhoneView(){
        Print.print("请输入你要修改的手机号");
        String updatePhone=sc.nextLine();
        CommonUserService.updateCommonUserPhone(updatePhone);
    }
    public static void commonUpdateSexView(){
        Print.print("请输入你要修改的性别");
        String updateSex=sc.nextLine();
        CommonUserService.updateCommonUserSex(updateSex);
    }



    public static void searchNoticeView(){
        System.out.println("=======================================");
        Print.print("请输入你公告查询方式");
        Print.print("1.查看所有公告");
        Print.print("2.根据公告标题模糊查询");
        Print.print("3.根据公告内容模糊查询");
        Print.print("4.退出公告查询");
        System.out.println("=======================================");
        String inputSearchKey=sc.nextLine();
        CommonUserController.commonSearchNoticeController(inputSearchKey);
    }
    public static void allNoticeView(){
        List<Notice> notices = App.noticeDao.selectAllNotice();
        if (notices!=null){
            for (int i = 0; i < notices.size(); i++) {
                notices.get(i).show();
            }
        }else {
            System.out.println("没有公告");
        }
        CommonUserView.searchNoticeView();
    }
    public static void searchNoticeHeadlineLikeView(){
        Print.print("请输入要查询的公告标题关键字");
        String headlineKey=sc.nextLine();
        List<Notice> notices = App.noticeDao.selectHeadLineLike(headlineKey);
        if (notices!=null){
            for (int i = 0; i < notices.size(); i++) {
                notices.get(i).show();
            }
        }else {
            System.out.println("没有该标题关键字的公告");
        }
        CommonUserView.searchNoticeView();
    }
    public static void searchNoticeDetailsLikeView(){
        Print.print("请输入要查询的公告内容关键字");
        String detailsKey=sc.nextLine();
        List<Notice> notices = App.noticeDao.selectDetailsLike(detailsKey);
        if (notices!=null){
            for (int i = 0; i < notices.size(); i++) {
                notices.get(i).show();
            }
        }else {
            System.out.println("没有该内容关键字的公告");
        }
        CommonUserView.searchNoticeView();
    }
}
