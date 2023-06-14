package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MA
 * @date 2023/6/11 13:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private int nid;
    private String headline;
    private String details;

    public void show(){
        System.out.println("公告id:"+this.nid);
        System.out.println("公告标题:"+this.headline);
        System.out.println("公告内容:"+this.details);
        System.out.println();
    }
}
