package com.seb.patterns.Singleton;

/**
 * Created by curland on 7/11/2016.
 */
public class SingleObject {

    private static SingleObject instance=null;

    private SingleObject(){}

    public static SingleObject getInstance(){

        //Thread safe
        synchronized(SingleObject.class) {
            if (instance == null) {
                instance = new SingleObject();
            }
        }

        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
