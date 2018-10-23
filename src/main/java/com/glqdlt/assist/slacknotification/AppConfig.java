package com.glqdlt.assist.slacknotification;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${slack.url}")
    String url;

    @Bean
    public SlackConfig slackConfig() {
        return SlackConfig.builder(url);
    }

}
