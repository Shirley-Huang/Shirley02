package com.dandan.ActiveMQ.Topic;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by dandan On July 15 2019
 *
 * Topic先运行发布者再运行订阅者可能导致订阅者收不到消息或者接收不完全
 *
 */
public class TopicSubsciber {

    private static String userName = ActiveMQConnection.DEFAULT_USER;
    private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
    private static String url = "tcp://localhost:61616";

    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try {
            Connection connection = connectionFactory.createConnection(userName, password);
            connection.start();
            final Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Topic destination = session.createTopic("A2");
            MessageConsumer consumer = session.createConsumer(destination);
            System.out.println(destination);
            consumer.setMessageListener(new MessageListener() {

                public void onMessage(Message message) {
                    try {
                        System.out.println("获取message---"+message.getJMSMessageID());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                    TextMessage textMessage = (TextMessage)message;
                    try {
                        System.out.println(textMessage.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                    try {
                        session.commit();
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });

        } catch (JMSException e) {
            e.printStackTrace();
        }
    }

}
