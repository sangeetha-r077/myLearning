package coreJava.variableScope;

public class WrapperClassExample {
    public static void main(String[] args) {
        booleanExample();
        intergalExample();
        floatingExample();
        charExample();
    }

    public static void booleanExample() {
        Boolean bool = Boolean.logicalAnd(false, true);
        int compare = bool.compareTo(false);
        System.out.println(compare);
    }

    public static void intergalExample() {
        int sum = Integer.sum(2, 3);
        System.out.println(sum);
    }

    public static void floatingExample() {
        double max = Double.max(11.3, 89.3);
        System.out.println(max);
    }

    public static void charExample() {
        int codePoint = Character.codePointAt("SAngeetha", 1);
        System.out.println(codePoint);
    }
}
