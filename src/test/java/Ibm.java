public class Ibm {
    String name,job,id;
    int salary;
    static int  totalsalary,count;
    Ibm(){
        count++;
        id = "IBM-"+Integer.toString(count);
    }
    public void getDetails(String name,String job,int salary){
        this.name=name;
        this.job=job;
        this.salary=salary;
        totalsalary=totalsalary+salary;
    }
    public void putDetails(){
        System.out.println("Employee id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Job Name = "+job);
        System.out.println("Employee Salary = "+salary);
    }
    public static void allsalary(){
        System.out.println("Salarys Given By IBM = "+totalsalary);
        System.out.println("Number of Count of Employees = "+count);
    }
    public static void main(String[] args) {
        Ibm h=new Ibm();
        Ibm d=new Ibm();
        h.getDetails("Hima Sekhar","Tester",25000);
        d.getDetails("Dilp Kumar","Developer",30000);
        h.putDetails();
        System.out.println("================================");
        allsalary();
        System.out.println("================================");
        d.putDetails();
        System.out.println("================================");
        allsalary();
        System.out.println("================================");
        Ibm a=new Ibm();
        a.getDetails("Anil Kumar","Data Science",45000);
        a.putDetails();
        System.out.println("================================");
        allsalary();
        System.out.println("================================");
    }
}
