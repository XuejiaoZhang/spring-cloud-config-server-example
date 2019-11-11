package com.example.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RefreshScope
@SpringBootApplication
public class ConfigclientApplication {

	@Value("${env.description}")
	String content;

	@RequestMapping("/")
	public String home() {
		return "content:" + content;
	}


	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}

}
