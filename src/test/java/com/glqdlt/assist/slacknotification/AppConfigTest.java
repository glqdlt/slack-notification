package com.glqdlt.assist.slacknotification;

import com.sun.xml.internal.ws.api.message.Message;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;


@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppConfigTest {

    @Autowired
    SlackConfig slackConfig;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    MessageSender messageSender;

    @Value("${slack.url}")
    private String url;

    @Test
    public void isConfigLoaded() {
        Assert.assertEquals("http://www.hello.com", slackConfig.getUrl());
    }

    @Test
    public void propertiesLoad() {
        Assert.assertEquals("http://www.hello.com", url);
    }

    @Test
    public void notNullMessageSender() {

        Assert.assertNotNull(messageSender);
    }

    @Test
    public void notNullRestTemplate() {

        Assert.assertNotNull(restTemplate);
    }
}