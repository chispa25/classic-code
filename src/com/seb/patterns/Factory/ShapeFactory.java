package com.seb.patterns.Factory;

import com.seb.patterns.Circle;
import com.seb.patterns.Rectangle;
import com.seb.patterns.Shape;
import com.seb.patterns.Square;

/**
 * Created by curland on 7/11/2016.
 */
public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

}
