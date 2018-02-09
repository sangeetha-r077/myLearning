package coreJava.variableScope;

public class ClassandLocalVariable {
    static  int classVar;
    public static void main(String[] args) {
        int localVar;
        System.out.println(classVar);
       //  System.out.println(localVar); u have to always initialize the local variable

    }
}
