package com.testSpring;

import com.SpringDemoBasics.Shape;
import com.learningSpring.Rectangle;
import com.learningSpring.ShapeFactory;
import com.learningSpring.Triangle;

//Service Class
public class TestShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(50);
        rectangle.setBreadth(20);
        System.out.println("Area of Rectangle = " + rectangle.calculateArea());
        Triangle triangle = new Triangle(50, 20);
        System.out.println("Area of Triangle = " + triangle.calculateArea()); // Tight Coupling

        Shape shape = null;
        shape = ShapeFactory.getInstance('R', 50, 30);
        System.out.println(" The area of the shape is = " + shape.calculateArea());

    }
}
