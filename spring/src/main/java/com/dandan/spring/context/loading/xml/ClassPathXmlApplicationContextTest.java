package com.dandan.spring.context.loading.xml;

import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by dandan On 七月 26 2019
 *
 * Spring自带了多种应用上下文的实现，区别仅仅在于如何加载配置
 *
 */
public class ClassPathXmlApplicationContextTest {

    public static void main(String[] args) {

        //配置文件所在位置不同，使用的上下文对象也不同

        //通过应用上下文将对象间的依赖关系加载到IOC容器中
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/signon.xml");
        //加载项目中到spring配置文件到容器
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("/spring/signon.xml");

        //加载系统盘中的配置文件到容器中
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("E://Spring/applicationContext.xml");
        //从容器中获取对象实例
        Object ieie = applicationContext.getBean(System.class);

//        SignonService service = applicationContext.getBean(SignonService.class);
//        List<Signon> all = service.findAll();
//        for (Signon signon : all) {
//            System.out.println(signon.getName()+"--"+signon.getValue());
//        }
        classPathXmlApplicationContext.close();
    }

    @Test
    public void createClassPathXmlApplicationContext() throws BeansException {
        String configLocation = "/spring/signon.xml";

        // 位置资源数组  array of resource locations
        String[] configLocations = new String[]{configLocation};

        //是否自动刷新上下文  whether to automatically refresh the context
        Boolean refresh = true;

        //父上下文 the parent context
        ApplicationContext parent = null;
    }


}
