package coreJava.ObjectsandClasses;

public class CopyConstructorTest {
    int id ;
    String name;
    CopyConstructorTest(int i, String s){
        id=i;
        name = s;
    }

    CopyConstructorTest(CopyConstructorTest cc) {
        id = cc.id;
        name = cc.name;
    }

    void display(){
        System.out.println(id + "---" + name);
    }

    public static void main(String[] args) {
        CopyConstructorTest c1 = new CopyConstructorTest(10,"abc");
        CopyConstructorTest c2 = new CopyConstructorTest(c1);
        c2.display();

    }
}
