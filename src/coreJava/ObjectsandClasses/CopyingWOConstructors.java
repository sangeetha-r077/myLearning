package coreJava.ObjectsandClasses;

public class CopyingWOConstructors {
    int age;
    String firstName;

    CopyingWOConstructors (int i, String name){
        age = i;
        firstName= name;
    }
    void display(){
        System.out.println(age + " "+ firstName);
    }

    CopyingWOConstructors(){}
    public static void main(String[] args) {
        CopyingWOConstructors c1 = new CopyingWOConstructors(12,"Snow");
        CopyingWOConstructors c2 = new CopyingWOConstructors();
        c2.age = c1.age;
        c2.firstName = c1.firstName;
        c1.display();
        c2.display();
    }
}

