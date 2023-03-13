package it.tasgroup.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    protected abstract void createWebsite(); //questo è il factory method dell oggetto a cui viene delegata l istanza

}
