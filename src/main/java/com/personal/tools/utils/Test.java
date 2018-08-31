/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.personal.tools.utils;

/**
 * @author: sunpeikai
 * @version: Test, v0.1 2018/7/19 15:43
 */
public class Test {
    public static void main(String[] args){
        String code = "山东省青岛市城阳区";
        System.out.println(code.substring(code.lastIndexOf("市")+1));
    }
}
