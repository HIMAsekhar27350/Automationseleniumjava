package String_Method;

public class Sum_of_Array_java {
    public static void main(String[] args) {
        int[] myarray = {1,5,15,25,10,10};
        int sum = 0;
        for (int i = 0; i < myarray.length; i++) {
            sum = sum+myarray[i];
        }
        System.out.println("In the Sum of the number = "+sum);
    }
}
