package org.launchcode.java.studios.restaurant;

import java.text.NumberFormat;

/**
 * Created by raefo on 22-May-17.
 */
public class MenuItem {
    private double price;
    private String name;
    private String desc;
    private String category;//appetizer,dessert,main course
    private boolean isNew;
    private static final NumberFormat curr = NumberFormat.getCurrencyInstance();//to format price

    public String getPrice() {
        return curr.format(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
        return getName() + "$" + getPrice();
    }
}
