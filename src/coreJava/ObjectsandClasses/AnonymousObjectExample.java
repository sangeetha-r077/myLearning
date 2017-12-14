package coreJava.ObjectsandClasses;

public class AnonymousObjectExample {
    void factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial is " + factorial);
    }

    public static void main(String[] args) {
        new AnonymousObjectExample().factorial(6);
    }
}
