package Oops;

public class College_details_oops {
    String first_name, last_name, DOM, Gender, school, father_name, mother_name, address, phone_no;
    double marks;

    public void college_details_input(String first_name, String last_name, String DOM, String Gender, String father_name, String mother_name, String address, String school, String phone_no,int marks) {
        this.first_name=first_name;
        this.last_name=last_name;
        this.DOM=DOM;
        this.father_name=father_name;
        this.Gender=Gender;
        this.mother_name=mother_name;
        this.marks=marks;
        this.address=address;
        this.phone_no=phone_no;
        this.school=school;
    }
    public void college_details_output(){
        System.out.println("First name = "+first_name);
        System.out.println("Last name = "+last_name);
        System.out.println("Date of Birth = "+DOM);
        System.out.println("Gender = "+Gender);
        System.out.println("Father name = "+father_name);
        System.out.println("Mother name = "+mother_name);
        System.out.println("School = "+school);
        System.out.println("Marks = "+marks);
        System.out.println("Address = "+address);
        System.out.println("phone_no = "+phone_no);
    }

    public static void main(String[] args) {
        College_details_oops details = new College_details_oops();
        details.college_details_input("VELLORE","HIMA SEKHAR","25-12-1999","Male","Super Hero","Super Women","11-108,kummara street,punganur,chittoor dist-517247","RCP school","12345678891",80);
        details.college_details_output();
    }
}
