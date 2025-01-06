public class car_details {
    String car_name;
    int car_speed;

    void addcardetails(String name, int speed) {
        this.car_name = name;
        this.car_speed = speed;
    }

    void displaycardetails() {
        System.out.println(" Car name = " + car_name);
        System.out.println(" Car Speed = " + car_speed);
    }

    public static void main(String[] args) {
        car_details car1 = new car_details();
        car_details car2 = new car_details();
        car1.addcardetails("Red car", 150);
        car2.addcardetails("Blue car", 200);
        car1.displaycardetails();
        car2.displaycardetails();
    }
}
