package com.seb.patterns.Decorator;

import com.seb.patterns.Circle;
import com.seb.patterns.Rectangle;
import com.seb.patterns.Shape;

/**
 * Created by curland on 7/11/2016.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
