package String_Method;

public class All_Ascll_values_java {
        public static void main(String[] args) {
            // Print ASCII values for uppercase 'A' to 'Z'
            System.out.println("Uppercase Letters (A to Z) and their ASCII values:");
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                int asciiValue = (int) ch;
                System.out.println(ch + " = " + asciiValue);
            }

            // Print ASCII values for lowercase 'a' to 'z'
            System.out.println("\nLowercase Letters (a to z) and their ASCII values:");
            for (char ch = 'a'; ch <= 'z'; ch++) {
                int asciiValue = (int) ch;
                System.out.println(ch + " = " + asciiValue);
            }
        }

}
