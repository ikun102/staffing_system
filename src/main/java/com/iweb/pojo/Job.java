package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MA
 * @date 2023/6/11 10:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Job {
    private int jid;
    private String jName;

    public void show(){
        System.out.println("职位id:"+this.jid+" 职位名称:"+this.jName);
    }
}
