package String_Method;

public class codepointAT_java {
    public static void main(String[] args) {
        String name = "VELLOR HIMA SEKHAR";
        int l = name.length();
        System.out.println("Length of the name =  "+l);
        int num=1;
        for(int i=0;i<l;i++){
            System.out.println(num+" = "+name.charAt(i));
            num++;
        }
        int codepoint= name.codePointAt(3);
        System.out.println("codePointAt = "+codepoint);
    }
}
