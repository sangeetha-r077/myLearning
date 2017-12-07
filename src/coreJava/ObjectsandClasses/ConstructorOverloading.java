package coreJava.ObjectsandClasses;

public class ConstructorOverloading {
    int id;
    String name;
    int age;

    ConstructorOverloading(int i, String s) {
        id = i;
        name = s;
    }

    ConstructorOverloading(int i, String s, int age1) {
        id = i;
        name = s;
        age = age1;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(10, "1st Name");
        ConstructorOverloading c2 = new ConstructorOverloading(23, "2nd Name", 23);
        c1.display();
        c2.display();
    }
}
