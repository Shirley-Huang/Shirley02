package com.dandan.mapper;

import com.dandan.pojo.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/4/27
 * @Desciption :
 */
public interface OrderMapper {

    public Order selectOrderById(@Param("orderId") String orderId);


}
