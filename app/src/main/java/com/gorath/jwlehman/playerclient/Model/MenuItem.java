package com.gorath.jwlehman.playerclient.Model;

/**
 * Created by Jeremy on 10/7/2015.
 * menu item model that will be implemented to be included in a listview selection menu
 */
public class MenuItem {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
