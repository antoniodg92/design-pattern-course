package it.tasgroup.structural.proxy;

//Interfaccia del proxy
public interface TwitterService {
    String getTimeline(String screenName);
    void postToTimeline(String screenName, String message);
}

