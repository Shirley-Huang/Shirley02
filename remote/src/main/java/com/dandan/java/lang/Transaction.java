package com.dandan.java.lang;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/28
 * @Desciption :
 */
@Getter
@Setter
@ToString
public class Transaction implements Cloneable{

    private Integer id;
    private String type;
    private String description;
    private Integer amount;
    private Date createTime;
    private Boolean applicanted;

    @Override
    protected Transaction clone() throws CloneNotSupportedException{
        return (Transaction) super.clone();
    }

}
