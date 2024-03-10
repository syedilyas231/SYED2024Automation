import javabasics.ReturnStatementExample;

public  class MethodOverLoadingExample {
    int a=531;  // global variable
    public static void main(String[] args) {

        MethodOverLoadingExample sd=new MethodOverLoadingExample();// to access non-static methods inside the class we should create an object for that class them method inse the class will be initialise
                                                          //
        sd.m10("syed",31);

    }
    public void m10(int a){  // paramatarized by single input by user
        System.out.println(a);
    }
    public void m10(int b,int c){   // paramatarized by two input by user
        System.out.println(b);System.out.println(c);
    }
    public void m10(String d,int e){  // paramatarized by two input  of different type by user
        System.out.println(d);
        System.out.println(e);
    }
    public void m10(int f,int g,int h){  // paramatarized by three input by user
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
