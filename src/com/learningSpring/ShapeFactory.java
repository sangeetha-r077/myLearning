package com.learningSpring;

import com.SpringDemoBasics.Shape;

public abstract class ShapeFactory {

    public static Shape getInstance(char userChoice, int length, int breadth) {
        switch (userChoice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                rectangle.setBreadth(50);
                rectangle.setLength(30);
                rectangle.calculateArea();
            default:
        }
        return null;
    }
}

