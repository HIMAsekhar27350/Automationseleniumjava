public class expection_handling {
    public static void  main(String[] args) {
        try {
            int a=10,b=2,div=a/b;
            System.out.println("div = "+div);
        } catch (Exception e) {
            System.out.println("Inivalid Input ");
        }finally {
            System.out.println("Programming is done");
        }

    }
}
