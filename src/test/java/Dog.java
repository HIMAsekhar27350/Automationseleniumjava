public class Dog {
    String name_dog;
    String breed_name;
    int cost_of_dog;
    public void dog_input(String name_dog,String breed_name,int cost_of_dog){
        this.name_dog=name_dog;
        this.breed_name=breed_name;
        this.cost_of_dog=cost_of_dog;
    }
    public void dog_output(){
        System.out.println("Name of Dog = "+name_dog);
        System.out.println("Breed of Dog = "+breed_name);
        System.out.println("cost of Dog = "+cost_of_dog);
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d2=new Dog();
        d1.dog_input("bati","super dog",1000);
        d2.dog_input("naveen","hero dog",1000);
        d1.dog_output();
        d2.dog_output();
    }
}
