package com.dandan.lombok;

import sun.nio.cs.ext.GBK;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/9
 * @Desciption :
 */                                                                           
public class UserTestClass {


    public static final String UTF_8 = "UTF-8";

    public static void main(String[] args) throws Exception {

        User user = new User();
        user.setUserName("丹");

        String userName = user.getUserName();
        System.out.println(userName);
        System.out.println(userName.length());//1
        System.out.println(userName.getBytes().length);//3
        System.out.println(userName.getBytes("GBK").length);//2
        System.out.println(userName.getBytes(UTF_8).length);//3
        System.out.println(userName.getBytes(UTF_8).length);//3

        double a = 1.12;

        int b = (int) a;

        Date now = new Date();  

        if (1 > 2) {
            System.out.println("123");
        }

        test01();

    }

    public static void test01(){

        System.out.println("11");
        System.out.println(22);
        System.out.println("333");

    }





}
