package com.glqdlt.assist.slacknotification;


import org.springframework.web.client.RestTemplate;

public class MessageSender {

    private final SlackConfig slackConfig;
    private RestTemplate restTemplate;

    public MessageSender(RestTemplate restTemplate, SlackConfig slackConfig) {
        this.restTemplate = restTemplate;
        this.slackConfig = slackConfig;
    }

    public void notification(String text) {
        restTemplate.postForLocation(slackConfig.getUrl(), text);
    }

}
