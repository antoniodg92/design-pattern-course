package it.tasgroup.creational.singleton;

public class Singleton {

    private static Singleton instance = null;

    //Il costruttore private impedisce l'istanza di oggetti da parte di classi esterne
    private Singleton() { }

    public static Singleton getInstance(){
        if (instance == null) {
            //questo non è ThreadSafe, ma ci permette il caricamento Lazy dell'instanza,
            // tale caricamento è un buon improvement per l' applicazione in termini di velocità
            instance = new Singleton();
        }
        return instance;
    }
}
