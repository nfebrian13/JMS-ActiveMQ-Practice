package com.activemq.practice.sender;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.activemq.practice.constant.Url;

/* 
 * Produce Message and send to activeMQ
 * 
 * */

public class ProducerMessage {

	public String produceMessage() throws JMSException {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(Url.URL.getUrl());
		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue(Url.SUBJECT.getUrl());
		MessageProducer producer = session.createProducer(destination);

		TextMessage message = session.createTextMessage("Hello Nana Febriana!");
		producer.send(message);
		
		String messageResult = message.getText();

		connection.close();
		return messageResult;
	}
}
