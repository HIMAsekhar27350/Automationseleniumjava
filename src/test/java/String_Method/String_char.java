package String_Method;

public class String_char {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        int l = url.length();
        System.out.println("Length of the url: "+l);
        int num = 1;
        for(int i=0;i<l;i++){
            System.out.println(num+" = "+url.charAt(i));
            num++;
        }
    }
}
