package com.gorath.jwlehman.playerclient.Model;

/**
 * Created by Jeremy on 10/7/2015.
 * individual message model
 */
public class Message {
    private User sender;
    private String message;

    public Message(User sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
