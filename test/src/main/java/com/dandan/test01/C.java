package com.dandan.test01;

/**
 * Created by dandan On 七月 31 2019
 */
public class C extends A implements B {

    private String str1;
//    String str2;
//    protected String str3;
//    public String str4;
//    private Integer var;

    private String[] clicli;

    Object[] params = new Object[1];


    static {
        i++;
        System.out.println("C.staticMethod" + i);
    }

    {
        i++;
        System.out.println("C.MethodCode" + i);
    }

    public C() {
        i++;
        System.out.println("C.Constructor" + i);
    }


    public void start() {

        System.out.println("C.method---start()");

    }

    public void stop() {
        System.out.println("C.method---stop()");

    }

    public boolean isRunning() {
        System.out.println("C.method---isRunning()");

        return false;
    }

//    public Integer getVar() {
//        return var;
//    }
//
//    public void setVar(Integer var) {
//        this.var = var;
//    }
//
//    public String getStr1() {
//        return str1;
//    }
//
//    public void setStr1(String str1) {
//        this.str1 = str1;
//    }
//
//    public String getStr2() {
//        return str2;
//    }
//
//    public void setStr2(String str2) {
//        this.str2 = str2;
//    }
//
//    public String getStr3() {
//        return str3;
//    }
//
//    public void setStr3(String str3) {
//        this.str3 = str3;
//    }
//
//    public String getStr4() {
//        return str4;
//    }
//
//    public void setStr4(String str4) {
//        this.str4 = str4;
//    }

    public String[] getClicli() {
        return clicli;
    }

    public void setClicli(String[] clicli) {
        this.clicli = clicli;
    }


    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

}
