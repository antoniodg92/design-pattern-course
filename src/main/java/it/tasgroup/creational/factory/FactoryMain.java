package it.tasgroup.creational.factory;

public class FactoryMain {

    public static void main(String[] args) {

        Website website = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(website.getPages()); // Vediamo che abbiamo instanziato un oggetto relativo all oggetto Blog

        website = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(website.getPages()); // Vediamo che abbiamo instanziato un oggetto relativo all oggetto Shop

    }
}
