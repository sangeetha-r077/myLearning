package coreJava.variableScope;

public class Data {
    public int value;
    public static void referenceMethod (Data data){data.value++;}
    public static void primitiveMethod ( int i ) {i++;}

    public static void main(String[] args) {
        Data data = new Data();
        int i = 0;
        referenceMethod(data);
        primitiveMethod(i);
        System.out.println(data); // Address are stored in the object reference
        System.out.println(i);   // stores the actual values i.e., called primitive variables

    }
}

