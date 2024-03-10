package javabasics;

public class ObjectCall{
    public static void main(String[] args) {
//        StaticAndNonstatic ss = new StaticAndNonstatic();
//        ss.m2();  // non static methods call only by create an object

        StaticAndNonstatic.m1(); // static methods call directly without creating an object

        ReturnStatementExample r=new ReturnStatementExample();  //create an object for non-static class
        int j=r.m11(); // as it use m10 method variable value in this it will store in int datatype and variable name j
        System.out.println(j);
        String  d=r.m22(); //  as it use m22 method variable value in this it will store in string datatype and variable name d
        System.out.println(d);
    }

}
