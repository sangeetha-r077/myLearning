package com.FewExamplesofJava;

public class SwapTwoNumbers {
    public static void main ( String[] args ) {
        int num1 = 10, num2 = 5;
        System.out.println ( num1 + "" + num2 + "Before Swapping" );
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println ( num1 + "" + num2 + "After Swapping" );
    }
}
