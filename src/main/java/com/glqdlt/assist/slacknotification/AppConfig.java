package com.glqdlt.assist.slacknotification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    final String url ="http://www.naver.com";

    @Bean
    public SlackConfig slackConfig() {
        return SlackConfig.builder(url);
    }

}
