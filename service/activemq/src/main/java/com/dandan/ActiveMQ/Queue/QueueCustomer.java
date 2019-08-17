package com.dandan.ActiveMQ.Queue;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * Created by dandan On July 15 2019
 */
public class QueueCustomer {

    private static String userName = ActiveMQConnection.DEFAULT_USER;
    private static String password = ActiveMQConnection.DEFAULT_PASSWORD;
    private static String url = "tcp://localhost:61616";

    public static void main(String[] args) {

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        try {
            Connection connection = connectionFactory.createConnection(userName, password);
            connection.start();
            final Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Queue distionation = session.createQueue("A1");
            MessageConsumer consumer = session.createConsumer(distionation);
            consumer.setMessageListener(new MessageListener() {

                public void onMessage(Message message) {
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
