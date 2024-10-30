package Oops;

public class Ploy {
    public void sum(int x,int y,double z){
        System.out.println("Sum = "+(x+y+z));
    }
    public void sum(double x,int y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public void sum(double x,double y,int z){
        System.out.println("Sum = "+(x+y+z));
    }
    public static void main(String[] args) {
        Ploy a=new Ploy();
        a.sum(5,5,5.5);
        a.sum(5.6,5,5);
        a.sum(5.6,5.7,5);
    }
}
