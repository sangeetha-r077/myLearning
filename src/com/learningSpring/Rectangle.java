package com.learningSpring;

import com.SpringDemoBasics.Shape;

public class Rectangle implements Shape {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public float calculateArea() {
        return length * breadth;
    }
}
