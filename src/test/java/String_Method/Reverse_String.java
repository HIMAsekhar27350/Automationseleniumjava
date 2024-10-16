package String_Method;

public class Reverse_String {
    public static void main(String[] args) {
        String origanalstr = "HIMA SEKHAR";
        String reversestr = "";
        for(int i = 0; i < origanalstr.length(); i++) {
           reversestr = origanalstr.charAt(i)+reversestr;
        }
        System.out.println("Orginal String = "+origanalstr+" to "+reversestr);
    }
}
