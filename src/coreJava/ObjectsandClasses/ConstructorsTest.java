package coreJava.ObjectsandClasses;

public class ConstructorsTest {

    public ConstructorsTest(String name){
        System.out.println(" Value of the name : " +name);
    }

    public static void main(String[] args) {
        ConstructorsTest ct = new ConstructorsTest("Jon");
    }
}
