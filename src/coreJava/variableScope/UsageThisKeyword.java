package coreJava.variableScope;

public class UsageThisKeyword {
    private int myField = 29;

    public void myMethod(String[] args) {
        int myField = 3;
        System.out.println(this.myField); // value will be shadowed with the this keyword
    }
}
