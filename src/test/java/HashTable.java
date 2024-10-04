import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<String,String> ht = new Hashtable<String,String>();
            ht.put("1","Hima");
            ht.put("2","Rajesh");
            ht.put("3","kumar");
            ht.put("1","Hima");
            ht.put("5","Manoj");
            ht.put("6","LeelaKath");
            ht.put("7","Naveen");
            ht.put("8","Anil Kumar");
            ht.put("Roman","9");
        System.out.println(ht);

    }
}

