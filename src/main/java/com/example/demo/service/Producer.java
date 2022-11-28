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
		
<<<<<<< HEAD
		
		
=======
>>>>>>> b46dd7749e9c76d5957731018b1f1cd7309eb451
		this.kafkatemplate.send(topic, message);
	}

}
