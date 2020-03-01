package com.activemq.practice;

import javax.jms.JMSException;

import com.activemq.practice.receiver.ConsumerMessage;
import com.activemq.practice.sender.ProducerMessage;

public class MainClass {

	public static void main (String[] args) throws JMSException {
		ProducerMessage produce = new ProducerMessage();
		ConsumerMessage consumer = new ConsumerMessage();
		
//		System.out.println(produce.produceMessage());
		System.out.println(consumer.consumeMessage());
		
	}
}
