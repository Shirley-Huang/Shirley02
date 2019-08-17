package com.dandan.news;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseMessage {

    private String toUserName;
    private String fromUserName;
    private Long createTime;
    private String msgType;

}
