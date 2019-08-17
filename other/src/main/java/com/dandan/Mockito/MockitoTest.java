package com.dandan.Mockito;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

/**
 * Created by dandan On July 24 2019
 *
 *
 * Mock测试框架
 * 划分为四个步骤
 * ①    使用 mockito 生成 Mock 对象；
 * ②    定义(并非录制) Mock 对象的行为和输出(expectations部分)；
 * ③    调用 Mock 对象方法进行单元测试；
 * ④    对 Mock 对象的行为进行验证。
 */
public class MockitoTest {


    public static void main(String[] args) {

        //创建mock对象，参数可以是类，也可以是接口
        List<String> mockObejct = Mockito.mock(List.class);

        //设置方法的预期返回值，如果mockObject.get(9)方法被调用，调用之后返回hell mockito
        Mockito.when(mockObejct.get(9)).thenReturn("hello mockito");


        boolean add = mockObejct.add("1");
        System.out.println(add);

        //验证mock对象是否调用了get(0)方法 -报错
//        String s = Mockito.verify(mockObejct).get(9);
//        System.out.println(s);

        System.out.println(mockObejct.get(9));


        //需在调用该方法后使用该verify方法
        String s2 = Mockito.verify(mockObejct).get(9);
        System.out.println(s2);

//        String s3 = Mockito.verify(mockObejct).get(9);
//        System.out.println(s3);





    }

    @Test
    public void testMockitoMethod() throws Exception{
        SayHello t1 = Mockito.mock(SayHello.class);
        SayHello t2 = Mockito.mock(SayHello.class);

        Mockito.when(t1.hello("dd")).thenReturn("hello huangdandan");
        Mockito.when(t2.hello("dd")).thenReturn("hello dandanHuang");

        String answer = t1.hello("dd");
        System.out.println(answer);

        //判断两个对象是否相等
        Assert.assertEquals("hello huangdandan",answer);
        System.out.println(answer);

        String t2Answer = t2.hello("dd");
        System.out.println(t2Answer);


        //校验执行的顺序
        InOrder inOrder = Mockito.inOrder(t1, t2);
        inOrder.verify(t1).hello("dd");
        inOrder.verify(t2).hello("dd");

//        inOrder.verify(t2).hello("ddh");



    }

    @Test
    public void testMockitoSpyMethod(){
        // 使用spy创建一个真实对象,会执行该类的方法具体实现
        SayHello list = Mockito.spy(SayHello.class);

        System.out.println(list.hello("oe"));


        Mockito.when(list.hello("oe")).thenReturn("haha");
        System.out.println(list.hello("oe"));

    }


}
