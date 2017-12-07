package coreJava.Strings;

public class StringBufferTest {
    public static String concatWithString() {
        String t = "Java";
        for (int i = 0; i < 1000; i++) {
            t = t + "Program";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 1000; i++) {
            sb.append("Program");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "Learn";
        s1.concat(" Java");
        System.out.println(s1); // wrt String

        StringBuffer sb = new StringBuffer("Learn");
        sb.append(" Java");
        System.out.println(sb); // wrt StringBuffer

        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with StringBuffer: "+ (System.currentTimeMillis() - startTime) + "ms");
    }
}
