import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Hima");
        name.add("Roman");
        name.add("Rajesh");
        name.add("Kumar");
        name.add("Sunil");
        name.add("Lakshmi");
        name.add("Mahohar");
        name.add("Hima");
        System.out.println("List of Names = "+name);
        System.out.println("Index Value = "+name.get(3));
        System.out.println("List is Size = "+name.size());
        for(String i : name){
            System.out.println(i);
        }
        Collections.sort(name);
        System.out.println("Collections of Names Sorting = "+name);
    }
}
