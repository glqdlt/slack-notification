package com.glqdlt.assist.slacknotification;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

@ActiveProfiles("prod")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageSenderTest {

    @Autowired
    MessageSender messageSender;

    @Autowired
    SlackConfig slackConfig;


    @Test()
    public void sendMessageString() {
        messageSender.notification("hi");
//         > hi
    }

    @Test()
    public void sendMessageJson() {
        messageSender.notification("{'text' : 'hihi'}");
//        > {'text' : 'hihi'}
    }
}