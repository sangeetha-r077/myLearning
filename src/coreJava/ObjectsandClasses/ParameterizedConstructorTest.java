package coreJava.ObjectsandClasses;

public class ParameterizedConstructorTest {
    int id;
    String name;

    ParameterizedConstructorTest(int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        ParameterizedConstructorTest p1 = new ParameterizedConstructorTest(12, "abc");
        ParameterizedConstructorTest p2 = new ParameterizedConstructorTest(13, "def");
        p1.display();
        p2.display();
    }

    void display() {
        System.out.println(id + " " + name);
    }
}