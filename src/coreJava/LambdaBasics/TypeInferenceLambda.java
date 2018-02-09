package coreJava.LambdaBasics;

public class TypeInferenceLambda {
    public static void main ( String[] args ) {
        StringLength myLambda = (String s)  -> s.length ();
        System.out.println (myLambda.getLength ( "Sangeetha" ));
    }

    interface StringLength {
        int getLength ( String s );
    }
}
