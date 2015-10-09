package com.gorath.jwlehman.playerclient.Model;

import java.util.List;

/**
 * Created by Jeremy on 10/7/2015.
 * Chat room class that will be used in room container
 *
 */
public class Room {
    private List<Message> messageList;
    private String name;
    private List<User> userList;

    public Room(String name, List<Message> messageList, List<User> userList ) {
        this.messageList = messageList;
        this.userList = userList;
        this.name = name;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
