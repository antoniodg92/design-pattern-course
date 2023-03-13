package it.tasgroup.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType facotryParameter){ //questo è il factory method della factory
        switch (facotryParameter) {
            case BLOG : {
                return new Blog();
            }

            case SHOP : {
                return new Shop();
            }

            default: {return null;}
        }

    }
}
