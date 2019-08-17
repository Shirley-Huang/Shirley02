package com.dandan.test01;

import org.junit.Test;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static java.lang.Class.forName;

/**
 * Created by dandan On 七月 27 2019
 */
public class classTest {


    @Test
    public void getClassName(){

        System.out.println(C.class.getName());

    }

    @Test
    public void subClassTest(){
        System.out.println("before---");

        C c = new C();

        System.out.println("after---");

        //A
        c.setProperties01("A.properties01");
        System.out.println(c.getProperties01());

        c.printInfo();
        System.out.println("'==============='");

        //B
        c.start();
        c.stop();
        System.out.println(c.isRunning());
        System.out.println("'==============='");


        //C
//        c.setVar(1);
//        System.out.println(c.getVar());
    }

    @Test
    public void testInstandOfMethod(){

        String a = "123";
        String b = null;
        if(a instanceof String){
            System.out.println("a-"+true);
        }

        if(b instanceof String){
            System.out.println(true);
        }

        if(a.equals(b)){
            System.out.println("a==b");
        }


    }

    @Test
    public void stringTest(){
        String a = null;
        System.out.println("a+" + 2 + "b=" + a);
    }

    @Test
    public void reflectTest() throws IllegalAccessException {
        Field[] declaredFields = C.class.getFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        System.out.println("============get declared filed");

        Field[] declaredFields1 = C.class.getDeclaredFields();
        for (Field field : declaredFields1) {
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
            System.out.println(field.getGenericType());
            //System.out.println(field.getInt(new A()));
        }

    }


    @Test
    public void classTest() throws ClassNotFoundException {
        try {
            Object object = C.class.newInstance();

            Class paramClass = forName("[Ljava.lang.String;");
            String[] param = { "吃", "喝", "玩", "乐" };
            Method method = C.class.getMethod("setClicli", paramClass);
            method.invoke(object, (Object) param);

            C c = (C) object;
            for (int i = 0; i < c.getClicli().length; i++) {
                System.out.println(c.getClicli()[i]);
            }

            System.out.println("");


        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test() throws ClassNotFoundException, IllegalAccessException {

        Field[] fields = C.class.getDeclaredFields();
        C c = new C();
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println(field.getName());
            System.out.println(modifiers);
            System.out.println(field.getType());
            System.out.println(Modifier.isPublic(modifiers));
            System.out.println(field.get(c));
        }


        String proxyName = "com.dandan.test01.classTest";
        Class<?> proxy = Class.forName(proxyName);
        System.out.println(proxy.isInterface());
        System.out.println(proxy.isAnnotation());
        System.out.println(proxy.isMemberClass());
        System.out.println(proxy.getInterfaces());

    }



}
