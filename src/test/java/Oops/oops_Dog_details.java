package Oops;

public class oops_Dog_details {
    String name,breed;
    int price;
    double weight;
    public void dog_details_input(String name,String breed,int price,double weight){
        this.name=name;
        this.breed=breed;
        this.price=price;
        this.weight=weight;
    }
    public void dog_details_output(){
        System.out.println("constructorDog Name = "+name);
        System.out.println("Breed Name = "+breed);
        System.out.println("Price of constructorDog = "+price);
        System.out.println("Weight of constructorDog = "+weight);
    }

    public static void main(String[] args) {
        oops_Dog_details details=new oops_Dog_details();
        oops_Dog_details details1=new oops_Dog_details();
        details.dog_details_input("Batii","Golden Retriever",25000,29);
        details1.dog_details_input("Buddy","Haskii",35000,35);
        details.dog_details_output();
        System.out.println("-------------------------------");
        details1.dog_details_output();
    }
}
