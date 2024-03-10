import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(234579,"ilyas");
        m.put(875877,"ahmed");
        System.out.println(m);
        System.out.println(m.get(875877));
    }
}
