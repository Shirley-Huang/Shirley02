package com.dandan.test;

import com.dandan.mapper.OrderMapper;
import com.dandan.pojo.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/27
 * @Desciption :
 */
public class OrderMapperTest extends AbstractPersistenceTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void selectOrderTest(){

        Order order = orderMapper.selectOrderById("1034530");
        System.out.println(order.toString());
    }

}
