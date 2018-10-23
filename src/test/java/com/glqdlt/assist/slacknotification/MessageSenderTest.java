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


    @Test(expected = HttpClientErrorException.class)
    public void sendMessageFail() {
//        HttpClientErrorException 에 대한 테스트 추가
//         아래 text 는 json 으로 날려야함
        messageSender.notification("hi");
    }

    @Test
    public void sendMessageSuccess() {
        messageSender.notification("{'text' : 'hihi'}");
    }
}