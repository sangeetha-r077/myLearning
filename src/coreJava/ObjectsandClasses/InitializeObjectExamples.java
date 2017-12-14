package coreJava.ObjectsandClasses;

public class InitializeObjectExamples {
     int rollno;
     String name;

     void insertRecord(int i, String s1){
         rollno = i;
         name = s1;
     }

     void display (){
         System.out.println(rollno + " "+ name);
     }
}
