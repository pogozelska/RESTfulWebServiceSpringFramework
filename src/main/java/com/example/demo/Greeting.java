package com.example.demo;

public class Greeting {
    private long id;
    private String content;
    private String urlLink;

    public Greeting(long id, String content, String url) {
        this.id = id;
        this.content = content;
        this.urlLink = url;

    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return urlLink;
    }
}
