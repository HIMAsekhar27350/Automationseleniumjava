package Oops;

public class oops_tooth_brush {
    String brand_name,hardness;
    int cost;
    public void tooth_brush_input(String brand_name,String hardness,int cost){
        this.brand_name=brand_name;
        this.hardness=hardness;
        this.cost=cost;
    }
    public void tooth_brush_output(){
        System.out.println("Tooth Brush = "+brand_name);
        System.out.println("Hard ness = "+hardness);
        System.out.println("Price = "+cost);
        if (hardness.equalsIgnoreCase("medium")) {
            System.out.println("The toothbrush has medium hardness, suitable for most users.");
        } else if (hardness.equalsIgnoreCase("soft")) {
            System.out.println("The toothbrush has soft bristles, recommended for sensitive gums.");
        } else {
            System.out.println("This toothbrush has a different hardness level.");
        }
    }

    public static void main(String[] args) {
        oops_tooth_brush details = new oops_tooth_brush();
        details.tooth_brush_input("colget max fresh","very hard",30);
        details.tooth_brush_output();
    }
}
