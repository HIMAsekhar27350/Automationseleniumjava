import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SortingSet {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<Integer>();
        num.add(100);
        num.add(25);
        num.add(20);
        num.add(15);
        num.add(30);
        num.add(10);
        num.add(40);
        num.add(5);
        num.add(5);
        System.out.println("Set of Number = "+num);
        System.out.println("To Get Index Values = "+num.size());

        for(Integer i : num){
            System.out.println(i);
        }

    }
}
