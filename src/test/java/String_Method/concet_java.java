package String_Method;

public class concet_java {
    public static void main(String[] args) {
        String father,mother,bother,hero,family;
        father = "superhero";
        mother = "superwoman";
        bother = "villan";
        hero = "himasekaher";
        family = father+mother+bother+hero;
        int l = family.length();
        System.out.println("Lenth of the family charater: "+l);
        int num=1;
        for(int i=0;i<l;i++){
            //System.out.println(num+" = "+family.charAt(i));
            if(family.charAt(i)=='a') {
                System.out.println(num + " = " + family.charAt(i));
                num = num + 1;
            }
        }
        System.out.println(num);
    }
}