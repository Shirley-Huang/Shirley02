package com.dandan.ActiveMQ.Queue;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.spring.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by dandan On July 15 2019
 */
public class QueueProductor {

    private static String userName = ActiveMQConnection.DEFAULT_USER;
    private static String passWord = ActiveMQConnection.DEFAULT_PASSWORD;
    private static String url = "tcp://localhost:21212";

    public static void main(String[] args) {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try {
            //1、使用user和password创建一个JMS Connection
            Connection connection = connectionFactory.createConnection(userName,passWord);
            //connection 启动
            connection.start();
            //2、创建一个发送或接收消息的线程session，同时设置收支持事务和acknowledge标识
            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            //3、创建指定其对应的主题subject名称  消息目的地，消息发送给谁
            Queue destincation = session.createQueue("A1");
            //消息的发送着
            MessageProducer producer = session.createProducer(destincation);
            //设置持久化
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            //构造消息
            sendMessage(session, producer);
            //关闭线程连接
            session.commit();

        } catch (JMSException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendMessage(Session session, MessageProducer producer) throws Exception{

        //有数量限制，小于1000
        for (int i = 0; i < 100; i++) {

            TextMessage message = session.createTextMessage("ActiveMQ 发送的消息" + i);

            System.out.println("发送消息：" + i);
            //发送消息到目的地
            producer.send(message);
        }



    }

}
