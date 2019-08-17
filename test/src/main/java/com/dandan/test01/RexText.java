package com.dandan.test01;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dandan On 八月 13 2019
 */
public class RexText {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[A-Z][a-z]*");
        String str = "Hddabcd";
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.matches());
        //尝试查找与该模式匹配的输入序列的下一个子序列
        System.out.println(matcher.find());
    }

    @Test
    public void test(){
        Boolean a = null;
        if(a && 1==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

//       C c = new C();
//       c.setParams(new Object[]{1});
//
//        System.out.println("=============="+c.getParams());

    }

}
