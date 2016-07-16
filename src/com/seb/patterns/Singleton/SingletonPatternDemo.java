package com.seb.patterns.Singleton;

/**
 * Created by curland on 7/11/2016.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible

        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
