package  Oops;
public class constructorDog {
    String dogName,breed,colour;
    int price;
    double weight;

    public void getDogName() {
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public constructorDog(String dogName, String breed, String colour, int price, double weight) {
        this.dogName = dogName;
        this.breed = breed;
        this.colour = colour;
        this.price = price;
        this.weight = weight;
    }
    public void dogOutput(){
        System.out.println("constructorDog Name = "+dogName);
        System.out.println("constructorDog Breed = "+breed);
        System.out.println("Colour of constructorDog = "+colour);
        System.out.println("Price of constructorDog = "+price);
        System.out.println("Weight of constructorDog = "+weight);
    }

    public static void main(String[] args) {
        constructorDog odj=new constructorDog("BigDog","BullDog","White",25000,35);
        odj.setDogName("TheRomanReigns");
        odj.getDogName();
        odj.setDogName("Hero of the plant");
        odj.getDogName();
        odj.dogOutput();
    }
}