package com.glqdlt.assist.slacknotification;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@Slf4j
@ActiveProfiles("prod")
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageSenderTest {

    @Autowired
    MessageSender messageSender;

    @Autowired
    SlackConfig slackConfig;

    @Test
    public void sendMessage() {


        log.info(slackConfig.getUrl());

        messageSender.notification("{\"text\": \"hahaha.\\nAnd this is another line of text.\"}");
    }
}