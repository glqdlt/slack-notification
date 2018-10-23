package com.glqdlt.assist.slacknotification;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlackConfigTest {

    @Test
    public void builderPatternTest() {
        final String url = "http://www.naver.com";
        SlackConfig config = SlackConfig.builder(url);
        Assert.assertEquals(url, config.getUrl());
    }
}