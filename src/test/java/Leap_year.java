public class Leap_year {
    static void leapyear(int year){
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(" its is leap year = "+year);
        }else {
            System.out.println("it is not leap year = " + year);
        }
    }

    public static void main(String[] args) {
        leapyear(2025);
    }
}
