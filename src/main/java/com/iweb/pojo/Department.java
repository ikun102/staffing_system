package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MA
 * @date 2023/6/11 13:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int did;
    private String dName;

    public void show(){
        System.out.println("部门id:"+this.did+" 部门名称:"+this.dName);
    }
}
