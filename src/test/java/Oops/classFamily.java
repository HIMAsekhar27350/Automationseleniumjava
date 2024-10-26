package Oops;

public class classFamily {
    public void fatherDetails(String fname){// Method without Return Type and With Agruments
        System.out.println("Father name = "+fname);
    }
    public void motherDetails(){// Method without Return Type and without Agruments
        System.out.println("Mother name = "+"SuperWomen");
    }
    public String myDetails(String name){// Method with Return Type and with Agruments
       return name;
    }
    public String sisterDetails(){// Method with Return Type and without Agruments
        return "Sister Name = Heroin";
    }
    public static void main(String[] args) {
        classFamily f = new classFamily();
        f.fatherDetails("SuperName");
        f.motherDetails();
        System.out.println(f.myDetails("My Name = Roman Regins"));
        System.out.println(f.sisterDetails());
    }
}
