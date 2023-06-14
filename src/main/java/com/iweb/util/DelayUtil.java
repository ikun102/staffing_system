package com.iweb.util;

/**
 * @author MA
 * @date 2023/6/13 9:52
 */
public class DelayUtil {
    public static void delay(){
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
