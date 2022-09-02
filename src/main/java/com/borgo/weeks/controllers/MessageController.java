package com.borgo.weeks.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.borgo.weeks.DTO.MessageList;

@RestController
public class MessageController {

	@PostMapping("/list")
	public MessageList getMessageList(@RequestBody String id) throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		
		final String baseUri = "https://discord.com/api/v9/guilds/809055669075312691/messages/search?author_id=" + id;
		URI uri = new URI(baseUri);
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("authorization", "OTMwNDEwOTA0NTE0ODc1NDU0.Gq6Ugb.1a2DWTojOIvmZ73VAcjJ3oXx73EDWgBMSPjZ2U");
		
		HttpEntity<MessageList> requestEntity = new HttpEntity<>(null, headers);
		
		ResponseEntity<MessageList> response = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, MessageList.class);
		
		return response.getBody();
	}
}
