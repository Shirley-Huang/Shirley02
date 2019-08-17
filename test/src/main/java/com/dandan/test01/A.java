package com.dandan.test01;

/**
 * Created by dandan On 七月 31 2019
 */
public class A {

    private String properties01;
    String properties02;
    protected String properties03;
    public String properties04;
    public static int i = 0;

    static {
        i++;
        System.out.println("A.staticMethod" + i);
    }

    {
        i++;
        System.out.println("A.MethodCode" + i);
    }

    public A() {
        i++;
        System.out.println("A.Constructor" + i);
    }

    public void printInfo(){
        System.out.println("A.method--printInfo");
    }

    public String getProperties01() {
        return properties01;
    }

    public void setProperties01(String properties01) {
        this.properties01 = properties01;
    }

    public String getProperties02() {
        return properties02;
    }

    public void setProperties02(String properties02) {
        this.properties02 = properties02;
    }

    public String getProperties03() {
        return properties03;
    }

    public void setProperties03(String properties03) {
        this.properties03 = properties03;
    }

    public String getProperties04() {
        return properties04;
    }

    public void setProperties04(String properties04) {
        this.properties04 = properties04;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        A.i = i;
    }

}
