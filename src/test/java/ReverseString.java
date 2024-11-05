public class ReverseString {
    public static void main(String[] args) {
        String input = "Hima sekhar!";
        String reversed = reverse(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverse(String str) {
        // Base case: if the string is empty or only one character, return it
        if (str.isEmpty()) {
            return str;
        }
        // Recursive call: take the last character and add it in reverse order
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
