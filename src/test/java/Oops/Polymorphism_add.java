package Oops;
// Same Method is Repeated no of times with same data type
public class Polymorphism_add {
    public void sum(int x) {
        System.out.println("Adding Two Values = "+(x+x));
    }
    public void sum(int x,int y ,int z) {
        System.out.println("Adding Three Values = "+(x+y+z));
    }
    public void sum(int x,int y ,int z,int o) {
        System.out.println("Adding Four Values = "+(x+y+z+o));
    }
    // Same Method is Repeated no of times with different data type
    public void sum(int a,int b){
        System.out.println("addition = "+(a+b));
    }
    public void sum(double x,double y){
        System.out.println("Adding the Fractions = "+(x+y));
    }
    public void sum(String x,String y){
        System.out.println("Adding the String = "+x+y);
    }
    public static void main(String[] args) {
        Polymorphism_add a=new Polymorphism_add();
        a.sum(5);
        a.sum(5,5,5);
        a.sum(5,5,5,5);
        a.sum(5,5);
        a.sum("Hima"," Sekhar");
        a.sum("Good"," Moring");
        a.sum(5.5,6.5);
    }
}
