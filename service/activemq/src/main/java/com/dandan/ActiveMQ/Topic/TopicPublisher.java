package com.dandan.ActiveMQ.Topic;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by dandan On July 15 2019
 */
public class TopicPublisher {
    private static String userName = ActiveMQConnection.DEFAULT_USER;
    private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
    private static String url = "tcp://localhost:61616";

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        Connection connection = null;
        try {
            connection = connectionFactory.createConnection(userName, password);
            connection.start();

            Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            //消息的目的地
            Topic destination = session.createTopic("A2");
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.PERSISTENT);
            sendMessage(session,producer);

            session.commit();


        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    public static void sendMessage(Session session, MessageProducer producer) throws JMSException {

        for (int i = 0; i < 100; i++) {
            TextMessage message = session.createTextMessage("Topic发布/订阅模式" + i);
            System.out.println(message.getText());
            producer.send(message);
        }
    }

}
