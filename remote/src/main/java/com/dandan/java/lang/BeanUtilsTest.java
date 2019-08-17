package com.dandan.java.lang;

import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/28
 * @Desciption :
 */
public class BeanUtilsTest {

    @Test
    public void beanUtilsTest(){

        TransactionRecord sourceTransaction = new TransactionRecord();
        sourceTransaction.setId(1);
        sourceTransaction.setAmount(2);
        sourceTransaction.setApplicanted(true);
        sourceTransaction.setCreateTime(new Date());
        sourceTransaction.setType("出库");
        sourceTransaction.setDescription("使用");
        sourceTransaction.setStorageName("服务商仓库");

        Transaction targetTransaction = new Transaction();
        //用于对象之间属性名相同的值拷贝
        BeanUtils.copyProperties(sourceTransaction, targetTransaction, new String[]{"id","applicanted"});

        System.out.println(targetTransaction.toString());


    }


}
