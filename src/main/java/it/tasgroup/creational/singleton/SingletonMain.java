package it.tasgroup.creational.singleton;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton singletonInstance = Singleton.getInstance();
        System.out.println(singletonInstance);
        Singleton anotherInstance = Singleton.getInstance();
        System.out.println(anotherInstance);
        if(singletonInstance==anotherInstance){
            System.out.println("They are the same instance");   //Dimostra che è stata creata una singola instanza
        }
    }
}
