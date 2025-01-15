import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.add(50);
    l.add(60);
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.get(4));
        System.out.println("List size = "+l.size());
        System.out.println(l.remove(0));
        System.out.println(l);


    }
}
