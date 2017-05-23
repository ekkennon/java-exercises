package org.launchcode.java.studios.restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by raefo on 22-May-17.
 */
public class Menu {
    private ArrayList<MenuItem> items;
    private Date updated;
    private String type;//breakfast,lunch,dinner

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
