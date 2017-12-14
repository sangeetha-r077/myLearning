package coreJava;

public class VariableTest {
    int a = 10; // Instance Variable
    static String b = "Hello"; // static variable

    public static void main(String[] args) {
        double c = 10.25; // local variable

        System.out.println("Print the value of the local variable " + c);
        System.out.println("Print the value of the static variable "+ b);
        VariableTest var = new VariableTest();
        System.out.println("Print the value of the instance variable "+ var.a);

    }
}
