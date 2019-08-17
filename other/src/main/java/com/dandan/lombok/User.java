package com.dandan.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author : HuangDandan
 * @CreateTime : 2019/5/9
 * @Desciption :
 */
@Getter
@Setter
public class User {

    private String userName;
    private String userMobile;
    private String userAddress;

}
