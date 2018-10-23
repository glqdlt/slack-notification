package com.glqdlt.assist.slacknotification;


import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class MessageSender {

    private final SlackConfig slackConfig;
    private RestTemplate restTemplate;

    public MessageSender(RestTemplate restTemplate, SlackConfig slackConfig) {
        this.restTemplate = restTemplate;
        this.slackConfig = slackConfig;
    }

    public void notification(String text) {
        Map<String,String> body = new HashMap<>();
        body.put("text",text);
        restTemplate.postForLocation(slackConfig.getUrl(), body);
    }

}
