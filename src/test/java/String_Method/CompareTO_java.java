package String_Method;

public class CompareTO_java {
    public static void main(String[] args) {
        String first_name = "VELLORE";
        String last_name = "HIMA SEKHAR";
        System.out.println("Compareing Both First name and Last name = "+first_name.compareTo(last_name));
        String name = first_name+last_name;
        int l=name.length();
        System.out.println("Length of the first name and last name = "+l);
        int num =1;
        for (int i = 0;i<l;i++){
            char ch = name.charAt(i);
            int ascllkeyvalues = (int) ch;
            System.out.println(num+" = "+ch+"-----"+ascllkeyvalues);
            num++;
        }
        System.out.println(first_name.contains("E"));
        System.out.println(last_name.contains("I"));
        System.out.println(last_name.contains("e"));
        char [] str = {'H', 'i', 'm', 'a', 's','e','k','h','a','r'};
        String str1 = "";
        str1 = String.copyValueOf(str,0,5);
        System.out.println("Returented values: "+str1);
    }
}
