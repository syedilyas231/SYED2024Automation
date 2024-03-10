import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<Integer>(); // set interface use with hashset class
        s.add(12);  // set store in unordered fashion
        s.add(78);   // add method will add values
        System.out.println(s);  // print stmnt for user reference
        s.add(12);  // won't store duplicate value
        s.add(100);
        System.out.println(s);
        s.add(234);
        System.out.println(s);
    }
}
