package Oops;

public class Square {
    int x;

    public void get(int x) {
        this.x=x;
    }
    public int put(){
        return (x*x);
    }
    public static void main(String[] args) {
        Square d1=new Square();
        d1.get(4);
        System.out.println("Square the Given Values = "+d1.put());
    }
}
