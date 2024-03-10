package javabasics;

public class ReturnStatementExample{
    int a=231;  // global variable
    public static void main(String[] args) {
        ReturnStatementExample s1=new ReturnStatementExample(); // for acess non-static methods we should create an object for initialise the methodsinside the class
        s1.m11();
    }
    public int m11(){
        int a=1;
      System.out.println(a); // local variable ( method will give preference to local variable first)
        System.out.println(this.a);// consider the "global variable of the current class" while execution. (i.e "this.variablename")

        return a;
    }
    public String m22(){
        String b="ilyassyedahmed";
        return b;

    }


}
