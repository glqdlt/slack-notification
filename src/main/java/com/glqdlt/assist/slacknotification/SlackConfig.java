package com.glqdlt.assist.slacknotification;

public class SlackConfig {

    private String url;

    private SlackConfig() {
    }

    private SlackConfig(String url) {
        this.url = url;
    }

    public static SlackConfig builder(String url) {

        return new SlackConfig(url);

    }

    public String getUrl() {
        return url;
    }
}
