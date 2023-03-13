package it.tasgroup.creational.singleton;

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instance = null;
    //la parola chiave volatile è condizione necessaria ma non sufficiente per rendere l' implementazione ThreadSafe

    private SingletonThreadSafe() {
        if (instance != null) {
            //Questa condizione previene il caso in cui si stia utilizzando la reflection, ed è condizione necessaria ma non sufficiente per rendere l'implementazione ThreadSafe
            throw new RuntimeException("Use getInstance() method");
        }
    }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                //con synchronized e le altre 2 condizioni commentate su, finalmente abbiamo un implementazione ThreadSafe
                //questo perchè se ci sono 2 thread che stanno invocando la stessa classe
                // uno di essi potrebbe creare un istanza e accavallarsi con l altra
                // per questo c'è bisogno anche di un doppio check se l istanza è null
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
