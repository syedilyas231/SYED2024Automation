import java.util.ArrayList;
import java.util.List;

public class ListExample {
    int a=450;
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>(); // list <dataType> is an "interface" & arraylist<DataType> is a "class"
        l.add(23);   // implemented add method from arraylist class & add method for add values
        l.add(31);    // list will store values in "ordered fashion" i.e sequential ordered print values
        l.add(31);    // list will store "duplicate values"
        l.add(45);
        System.out.println(l);  // print stmnt
        System.out.println(l.get(2));  // with help of get method we can pass index value
        l.add(190);
        System.out.println(l);  // print stmnt

        List<String> l1=new ArrayList<>();  // list <dataType> is an "interface" & arraylist<DataType> is a "class"
         l1.add("syed");   // add methods stores the string datatype
         l1.add("ahmed");
         l1.add("ilyas");
        System.out.println(l1);
        l1.add("name");
        System.out.println(l1.get(2));

for (String ii:l1){    // advance loop-"String--datatype-output"  "ii-output variable name " "input-l1 i.e from list "

    System.out.println(ii);
}


    }


}
