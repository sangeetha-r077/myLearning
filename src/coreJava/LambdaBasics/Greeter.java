package coreJava.LambdaBasics;

public class Greeter {
    public void greet(Greetings greetings){
        greetings.perform ();
    }

    public static void main ( String[] args ) {
       Greeter greeter = new Greeter ();
        HelloworldGreetings helloworldGreetings = new HelloworldGreetings ();
        greeter.greet ( helloworldGreetings );

       // MyLambda myLambdaPerform = () -> System.out.println ("I am lambda"); // type of the functionally value
        Greetings mylambda = () -> System.out.println ("Java 8 greeting with lambda");
        mylambda.perform ();

        MyAddLambda addFunction = (int a , int b) -> a+b;
    }

    interface MyAddLambda{
        int add (int x , int y); // to define the signature for the function
    }
}
