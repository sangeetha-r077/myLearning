package com.edge.myLearning.coreJava;

public class VariablesTest {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        String _var = new String("Calling Local_Variable");
        System.out.println(_var);
        System.out.println(b); // calling of static variable
        VariablesTest vt = new VariablesTest();
        System.out.println(vt.a);
    }

}
