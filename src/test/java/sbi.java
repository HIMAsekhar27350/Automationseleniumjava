public class sbi {
    String accountnumber,name;
    int balance;
    public void detailsInput(String a,String n,int b){
        accountnumber=a;
        name=n;
        balance=b;
    }
    public void detailsOutput(){
        System.out.println(accountnumber);
        System.out.println(name);
        System.out.println(balance);
    }

    public static void main(String[] args) {
        sbi s1 = new sbi();
        sbi s2 = new sbi();
        s1.detailsInput("12345679","Herooo",7895316);
        s1.detailsOutput();
        System.out.println("----------------------------------");
        s2.detailsInput("45698778","villan",987458455);
        s2.detailsOutput();

    }
}
