package com.learningSpring;

import com.SpringDemoBasics.Shape;

public class Triangle implements Shape {
    private int length;
    private int breadth;

    public Triangle(int breadth) {
        this.breadth = breadth;
    }

    public Triangle(int length, int breadth) {
        super();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public float calculateArea() {
        return (length * breadth) / 2;
    }
}
