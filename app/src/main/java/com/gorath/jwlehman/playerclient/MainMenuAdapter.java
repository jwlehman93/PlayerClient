package com.gorath.jwlehman.playerclient;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.gorath.jwlehman.playerclient.Model.MenuItem;

import java.util.List;

/**
 * Created by Jeremy on 10/11/2015.
 * adapter for main menu. May not be needed
 */
public class MainMenuAdapter extends BaseAdapter{
    private List<MenuItem> menuitems;
    private Context context;

    public MainMenuAdapter(List<MenuItem> menuitems, Context context) {
        this.menuitems = menuitems;
        this.context = context;
    }

    @Override
    public int getCount() {
        return menuitems.size();
    }

    @Override
    public Object getItem(int position) {
        return menuitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View recycle, ViewGroup viewGroup) {
        if(recycle == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            recycle = inflater.inflate(R.layout.menu_item,viewGroup,false);
            TextView item = (TextView) recycle.findViewById(R.id.menu_item_name);
            item.set

        }
        return null;
    }
}
