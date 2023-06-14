package com.iweb.util;

import java.util.Random;

/**
 * @author MA
 * @date 2023/6/11 14:07
 */
public class StringUtil {
    public static String getRandomStr(int n){
        Random r = new Random();
        StringBuilder strPool = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if(Character.isLetterOrDigit((char)i)){
                strPool.append((char)i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(strPool.charAt(r.nextInt(strPool.length())));
        }
        return sb.toString();

    }
}
