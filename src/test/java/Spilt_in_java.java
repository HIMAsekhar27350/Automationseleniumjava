public class Spilt_in_java {
    public static void main(String[] args) {
        String spilt_sentences  = "Hi, This is Hima sekhar. I am from Punganur,Chittor dist,Andhar pradesh. I am recently grauated in BSC(Elecroins) in mother therase intitues.";
        System.out.println(spilt_sentences);
        String sentences[] = spilt_sentences.split("\\.");
        for(String s :sentences){
            System.out.println(s);
        }
    }
}
