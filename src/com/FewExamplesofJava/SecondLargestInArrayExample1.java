package com.FewExamplesofJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArrayExample1 {
    public static int getSecondLargest(Integer[] a, int total){
        List <Integer> lt = Arrays.asList (a);
        Collections.sort (lt);
        int element = lt.get(total-2);
        return element;
    }

    public static void main ( String[] args ) {
        Integer a[]={1,2,5,6,3,2};
        System.out.println("Second Largest: "+getSecondLargest(a,6));

    }
}
