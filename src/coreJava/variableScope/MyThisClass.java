package coreJava.variableScope;

public class MyThisClass {
    private int integer = 0;

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public static void main(String[] args) {
        MyThisClass myThisClass = new MyThisClass();
        myThisClass.setInteger(2);
        System.out.println(myThisClass.getInteger());
    }

}
