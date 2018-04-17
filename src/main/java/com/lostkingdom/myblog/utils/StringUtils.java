package com.lostkingdom.myblog.utils;

public class StringUtils {

    //return false if string s is null or ""
    public static Boolean isNotBlank(String s){
        if(s != null && !"".equals(s)){
            return true;
        }else {
            return false;
        }
    }
}
