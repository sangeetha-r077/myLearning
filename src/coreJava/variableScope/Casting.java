package coreJava.variableScope;

public class Casting {
    public static void main(String[] args) {
        int i = 10;
        long myLong = i;
        System.out.println(myLong); // widening is implicit
        long myvalue = 90L;
        int narrowingValue = (int) myvalue;
        System.out.println(narrowingValue); // narrowing is the explicit
    }
}
