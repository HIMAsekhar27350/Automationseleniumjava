//import jdk.incubator.vector.VectorOperators;

public class oops_employee {
    String employee_id,employee_name;
    int salary;
    public void employee_details_input(String employee_id,String employee_name,int salary){
        this.employee_id=employee_id;
        this.salary=salary;
        this.employee_name=employee_name;
    }
    public void employee_details_output(){
        System.out.println(employee_id);
        System.out.println(employee_name);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        oops_employee details=new oops_employee();
        details.employee_details_input("1488163","Vellore Hima seekhar",400000);
        details.employee_details_output();
        details.employee_details_input("6465515","Roman regins",654646464);
        details.employee_details_output();

    }
}
