package it.tasgroup.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();
    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;
        try{
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        //setto questi attributi che come vedremo nel main costituiranno valori di default che non devo risettare ogni volta
        movie.setTitle("basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPage(335);
        book.setPrice(22.11);
        book.setTitle("basic book");





    }

}
