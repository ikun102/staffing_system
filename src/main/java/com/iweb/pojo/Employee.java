package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MA
 * @date 2023/6/11 13:55
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int eid;
    private String password;
    private boolean isManager;
    private String eName;
    private String idNumber;
    private String phone;
    private String sex;
    private String jName;
    private String dName;

    public void show(){
        System.out.println("用户id："+this.eid+" 用户密码："+this.password+
                " 用户是否为管理员:"+(this.isManager?"是":"否")+" 员工姓名:"+this.eName+
                " 员工身份证号:"+this.idNumber+" 员工手机号:"+this.phone+" 员工性别:"+this.sex+
                " 员工职位:"+this.jName+" 员工所属部门:"+this.dName);
    }


}
