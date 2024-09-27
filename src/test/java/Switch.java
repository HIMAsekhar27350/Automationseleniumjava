import java.util.Scanner;

public class Switch {
    public static void main(String[] args) throws Exception {
        int choice;
        Scanner sc=new Scanner("System.in");
        System.out.println("press 1 for prabhas");
        System.out.println("press 2 for ntr");
        System.out.println("press 3for Raviteja");
        System.out.println("enter u ur above choice");
        choice=sc.nextInt();
        switch (choice){
            case 1:

                System.out.println("Prabhes");
                break;
            case 2:
                System.out.println("NTR");
                break;
            case 3:
                System.out.println("Ravi teja");
                break;
            case 4:
                System.out.println("Nani");
                break;
            default:
                System.out.println("Invailld option");
        }
    }
}
