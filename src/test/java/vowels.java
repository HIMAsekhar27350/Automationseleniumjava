public class vowels {
    public static void main(String[] args) {
        String name="Hima sekhar";
        String vowels="aeiou";
        name=name.toLowerCase();
        System.out.println("we find in the "+name);
        int i = 1;
        for(char ch:name.toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                System.out.println(i+" = "+ch);
                i++;
            }
        }
    }
}
