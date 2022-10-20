package com.websocket.nacer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.websocket.nacer.handlers.ServerWebSocketHandler;

@Configuration
@EnableWebSocket
@EnableScheduling
public class ServerWebSocketConfig implements WebSocketConfigurer{

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addHandler(webSocketHandler(), "/websocket");
	}

	 @Bean
	 public WebSocketHandler webSocketHandler() {
	      return new ServerWebSocketHandler();
	 }
}
