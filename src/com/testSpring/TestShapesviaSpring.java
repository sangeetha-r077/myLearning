package com.testSpring;

import com.SpringDemoBasics.Shape;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShapesviaSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Shape shape = (Shape) context.getBean("rectangle");
        System.out.println(shape.calculateArea());

        context.close();


    }
}
