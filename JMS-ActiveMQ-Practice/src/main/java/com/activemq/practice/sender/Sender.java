package com.activemq.practice.sender;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Sender {

	/*
	 * URL of the JMS server. DEFAULT_BROKER_URL will just mean that JMS server is
	 * on localhost
	 */
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;

	/* default broker URL is : tcp://localhost:61616" */
	private static String subject = "JCG_QUEUE";

	/* Queue Name.You can create any/many queue names as per your requirement. */

	public static void main(String[] args) throws JMSException {

		
	}
}
