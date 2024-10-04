//Java Program to Create Array Lists And Arrage Them in Order
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        num.add(20);
        num.add(6);
        num.add(8);
        num.add(30);
        num.add(10);
        num.add(19);
        System.out.println(num);
        for(Integer i : num) {
            System.out.println(i);
        }
        Collections.sort(num);
        System.out.println("Collections of Number is sort = "+num);

    }

}
