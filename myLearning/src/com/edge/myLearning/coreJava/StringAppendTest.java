package coreJava.Strings;

public class StringAppendTest {
    public static void main(String[] args) {
        String s = "Sangeetha"+" Rajkumar";
        System.out.println(s);
        String s1 = 50 + " String " + 100 + 30; // In java , After a string literal, all the + will be treated as string concatenation operator
        System.out.println(s1);
        String s2 = "Learn";
        String s3 = " Java";
        String s4 = s2.concat(s3);
        System.out.println(s4);
    }
}
