package com.glqdlt.assist.slacknotification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Value("${slack.url}")
    String url;


    @Bean
    public SlackConfig slackConfig() {
        return SlackConfig.builder(url);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public MessageSender messageSender() {
        return new MessageSender(restTemplate(), slackConfig());
    }

}
