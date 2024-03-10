package javabasics;

public class MethodOverRidingExample extends ReturnStatementExample {
    public static void main(String[] args) {
MethodOverRidingExample ss=new MethodOverRidingExample();  // when ever we create an object for class it initailise the methods inside the particular class and execute


        ss.m11();
    }
    public int m11(){
      int a=31;
        System.out.println(a);
        return a;
    }
}
