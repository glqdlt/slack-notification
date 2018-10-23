package com.glqdlt.assist.slacknotification;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
public class AppConfigTest {

    @Autowired
    SlackConfig slackConfig;

    @Test
    public void isConfigLoaded() {

        Assert.assertEquals("http://www.naver.com",slackConfig.getUrl());

    }
}