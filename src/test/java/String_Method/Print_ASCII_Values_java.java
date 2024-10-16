package String_Method;

public class Print_ASCII_Values_java {
        public static void main(String[] args) {
            String father, mother, bother, hero, family;
            father = "superhero";
            mother = "superwoman";
            bother = "villan";
            hero = "himasekaher";
            family = father + mother + bother + hero;
            int l = family.length();
            System.out.println("Length of the family characters: " + l);
            int num = 1;
            for (int i = 0; i < l; i++) {
                char ch = family.charAt(i);
                int asciiValue = (int) ch;
                System.out.println(num+" . "+ch + " = " + asciiValue);
                num++;
            }
        }

}
