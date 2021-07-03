package com.db.websocketapi;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {
    private String id;
    private String from;
    private String text;
    private LocalDateTime time;

    public Message() {
        id = UUID.randomUUID().toString();
        time = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
