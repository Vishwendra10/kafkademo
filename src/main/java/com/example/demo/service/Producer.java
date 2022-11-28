package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String, String> kafkatemplate;
	
	public void publish(String message) 
	{
		String topic= "MyTopic";
		
		
		
		
		this.kafkatemplate.send(topic, message);
	}

}
