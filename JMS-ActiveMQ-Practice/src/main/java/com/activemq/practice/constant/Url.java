package com.activemq.practice.constant;

import org.apache.activemq.ActiveMQConnection;

public enum Url {

	URL(ActiveMQConnection.DEFAULT_BROKER_URL),
	SUBJECT("NANA_QUEUE_TEST");

	private String url;

	Url(String envUrl) {
		this.url = envUrl;
	}

	public String getUrl() {
		return url;
	}

}
