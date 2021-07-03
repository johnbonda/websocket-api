package com.db.websocketapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.WebSocketSession;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootApplication
public class WebsocketApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketApiApplication.class, args);
	}

	@Bean
	public List<WebSocketSession> getSessions() {
		return new CopyOnWriteArrayList<>();
	}

}
