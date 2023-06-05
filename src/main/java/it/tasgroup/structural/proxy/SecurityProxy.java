package it.tasgroup.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Questo implemeta l'InvocationHandler, è il Proxy
public class SecurityProxy implements InvocationHandler {

    private Object obj;

    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object obj) {
        return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SecurityProxy(obj));
    }

    /**
     * Implementiamo un a customizzazione per realizzare un Security Proxy,
     * facciamo un controllo ad es che un certo name Post non debba essere contenuto
     * (per lanciare la demo relativa a questo esempio serve TwitterServiceImpl
     * che ho lasciato commentato in quanto servonon le api Tweeter)
     *
     */
    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        Object result;
        try {
            if(m.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            }
            else {
                result = m.invoke(obj, args);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
        }
        return result;
    }

}
