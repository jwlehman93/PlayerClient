package com.gorath.jwlehman.playerclient;

import com.gorath.jwlehman.playerclient.Model.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeremy on 10/11/2015.
 */
public class MenuItemProviders {
    private List<MenuItem> items = new ArrayList<MenuItem>(){{
        add(new MenuItem("Chat Forums"));
        add(new MenuItem("Schedule"));
        add(new MenuItem("Practice Schedule"));
        add(new MenuItem("Contact Officers and Coaches"));
    }};
}
