package Oops;

public class Sqaure1 {
    int x,result;

    public int get(int x) {
        this.x=x;
        result = this.x*this.x;
        return (result);
    }

    public static void main(String[] args) {
        Sqaure1 d1=new Sqaure1();
        System.out.println(d1.get(5));
    }
}
