package it.tasgroup.creational.factory;

public class Shop extends Website{

    @Override
    protected void createWebsite() {
        pages.add(new CardPage());
        pages.add(new ItemPage());
    }
}
