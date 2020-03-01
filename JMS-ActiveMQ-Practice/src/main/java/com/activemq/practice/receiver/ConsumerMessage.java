package com.activemq.practice.receiver;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.activemq.practice.constant.Url;

public class ConsumerMessage {

	public String consumeMessage() throws JMSException {
		
		String result = null;

		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(Url.URL.getUrl());
		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue(Url.SUBJECT.getUrl());
		MessageConsumer consumer = session.createConsumer(destination);

		Message message = consumer.receive();

		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			result = textMessage.getText();
		}
		
		connection.close();
		return result;
	}
}
