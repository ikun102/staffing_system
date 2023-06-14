package com.iweb.util;

/**
 * @author MA
 * @date 2023/6/11 14:04
 */
public class Print {
    public static void print(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
