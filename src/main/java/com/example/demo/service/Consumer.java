package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "MyTopic", groupId= "MyTopicId")
	public void consume(@Payload String message)
	{
		System.out.println(message);
	}

}
