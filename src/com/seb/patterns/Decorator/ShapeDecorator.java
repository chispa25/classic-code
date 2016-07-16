package com.seb.patterns.Decorator;

import com.seb.patterns.Shape;

/**
 * Created by curland on 7/11/2016.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
