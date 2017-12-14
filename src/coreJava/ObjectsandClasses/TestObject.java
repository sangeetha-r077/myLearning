package coreJava.ObjectsandClasses;

public class TestObject {
    public static void main(String[] args) {
        InitializeObjectExamples i1 = new InitializeObjectExamples();
        i1.rollno = 1001;
        i1.name = "Naina";
        i1.display(); // Via  reference variable Storing of objects
        InitializeObjectExamples i2 = new InitializeObjectExamples();
        i2.insertRecord(1002,"Anit");
        i2.display(); // initializing via method
    }
}
