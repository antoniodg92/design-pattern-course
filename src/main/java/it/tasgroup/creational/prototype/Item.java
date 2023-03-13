package it.tasgroup.creational.prototype;

import java.util.Objects;

public class Item implements Cloneable{
    private String title;
    private double price;
    private String url;

    public String getTitle() {
        return title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
