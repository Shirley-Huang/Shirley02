package com.dandan.Mockito;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by dandan On 七月 25 2019
 */
public class SignonServiceTest {

    @Test
    public void testFindAll(){
        System.out.println("begin=---");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/signon.xml");
        SignonService service = applicationContext.getBean(SignonService.class);
        List<Signon> all = service.findAll();
        for (Signon signon : all) {
            System.out.println(signon.getName()+"--"+signon.getValue());
        }
        applicationContext.close();
    }



}
