package com.dandan.java.lang;

import lombok.Data;

import java.util.Date;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/28
 * @Desciption :
 */
@Data
public class TransactionRecord {

    private Integer id;
    private String type;
    private String description;
    private Integer amount;
    private Date createTime;
    private Boolean applicanted;
    private String storageName;


}
