package com.dandan.java.lang;

import org.junit.Test;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/28
 * @Desciption :
 */
public class CloneMethodTest {

    @Test
    public void cloneTest() throws Exception{

        Transaction formStorageTransaction = new Transaction();
        formStorageTransaction.setType("入库");
        formStorageTransaction.setDescription("申领");
        formStorageTransaction.setAmount(20);
        formStorageTransaction.setCreateTime(new Date());
        formStorageTransaction.setApplicanted(true);

        Transaction toStorageTransaction = formStorageTransaction.clone();
        toStorageTransaction.setApplicanted(false);

        System.out.println(formStorageTransaction.toString());
        System.out.println(toStorageTransaction.toString());

        //浅度克隆---对象实现Cloneable接口
        //副作用。假如被复制的对象包含了一个称为obRef的引用变量，当副本创建时，副本中的obRef如同原对象中的obRef一样引用相同的对象。
        // 如果副本改变了被obRef引用的对象的内容，那么对应的原对象也将被改变。
        // 另一个例子。如果一个对象打开一个I/O流并被复制，两个对象将可操作相同的流。而且，如果其中一个对象关闭了流，
        // 而另一个对象仍试图对I/O流进行写操作的 话，将导致错误。


        //深度克隆---对象中的对象实现Cloneable接口
        // 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。



    }

    @Test
    public void testIntegerCompare(){
        Integer a = 2;
        Integer b = 2;
        if(a == b){
            System.out.println("相等");
        }

        testIntegerParam(a);
    }


    public void testIntegerParam(Integer a){
        Integer b = 2;
         if(a == b){
             System.out.println("相等");
         }
    }

}
