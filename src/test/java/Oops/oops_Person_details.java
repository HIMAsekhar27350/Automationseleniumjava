package Oops;

public class oops_Person_details {
    String name,gender,address;
    int age;
    public void person_details_input(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
    public void person_details_output(){
        System.out.println("Enter Your Name = "+name);
        System.out.println("Enter Your Gender = "+gender);
        System.out.println("Enter Your Age = "+age);
        System.out.println("Enter Your Address = "+address);
    }

    public static void main(String[] args) {
        oops_Person_details details=new oops_Person_details();
        oops_Person_details details1=new oops_Person_details();
        details.person_details_input("Roman Reigns","male","#5646,hyb",55);
        details1.person_details_input("Ravi","Male","611465,punganur",69);
        details.person_details_output();
        System.out.println("---------------------");
        details1.person_details_output();
    }
}
