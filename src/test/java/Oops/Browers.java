package Oops;

public class Browers {
    String browers,company;
    int users;
    double rating;
    public void browersIntput(String browers,String company,int users,double rating){
        this.browers=browers;
        this.company=company;
        this.users=users;
        this.rating=rating;
    }
    public void browersOutput(){
        System.out.println(browers+company+users+rating);
    }

    public static void main(String[] args) {
        Browers web1 = new Browers();
        Browers web2 = new Browers();
        Browers web3 = new Browers();
        web1.browersIntput("Chromebrowers","Google",10000,4.5);
        web2.browersIntput("edge","Mircosoft",50000,6.5);
        web3.browersIntput("firefox","Mozilla Corperations",62000,4.2);
    }
}
