import java.io.IOException;

public class java_Excaption {
    public static void main(String[] args) {
        try {
            int a[] = {10, 2};
            int div;
            div = a[0] / a[1];
            Integer b = Integer.parseInt("10hikma");
            System.out.println(b);
            System.out.println("div = " + div);
        } catch (ArithmeticException e) {
            System.out.println("Denometer is zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is incorrect");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array Size is negative");
        } catch (NumberFormatException e) {
            System.out.println("Dont enter string instand of integer");
        } finally {
            System.out.println("Thank you");
        }
    }
}
