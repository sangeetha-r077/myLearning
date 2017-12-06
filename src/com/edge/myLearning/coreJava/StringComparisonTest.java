package coreJava.Strings;

public class StringComparisonTest {
    public static void main(String[] args) {
        String s1 = "Intellij";
        String s2 = "Intellij";
        String s3 = new String("Intellij");
        String s4 = "eclipse";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s4));

        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a.equals(b));
        System.out.println(a==b);

        String myString = "";
        System.out.println(myString);

    }
}
