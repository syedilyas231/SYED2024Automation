package javabasics;

public class ConstructorExample {
   static int a;
    public ConstructorExample(){ //creating the constructor with same name of class name
     a=12;
    }

    public static void main(String[] args) {
        ConstructorExample c=new ConstructorExample();   // creating "constructor-call" by creating an object for particular class
        System.out.println(a);
    }
}
