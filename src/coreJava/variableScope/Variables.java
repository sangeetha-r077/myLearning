package coreJava.variableScope;

public class Variables {
    int number = 123; // class level variable
    void myMethod(){
        System.out.println(number);
        System.out.println(text);
        int i = 0;
        System.out.println(i); // method - level variable
    }
    private String text = "text"; // Class Level Variable
}
