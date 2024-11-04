public class Multiplication_table {
    public static void main(String args[]){
        int i,j;
        for(i=1;i<=100;i++){
            System.out.println("Mulitiplication table : "+i);
            for(j=1;j<=10;j++){
                System.out.println(i+" X "+j+" = "+(i*j));
            }
        }
    }
}