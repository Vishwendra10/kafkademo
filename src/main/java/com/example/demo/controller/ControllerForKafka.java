package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

@RestController
@RequestMapping("/v1")
public class ControllerForKafka {
	
	@Autowired
	private Producer producer;
	
	@GetMapping("/test/kafka")
	public void sendMessage(@RequestParam("message3") String message)
	{
		producer.publish(message);
	}
	
	

}
