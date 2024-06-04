package Vehicle;

public class Truck extends Vehicle {
    private int weight;

    public Truck(int weight, double regularPrice, String color, int speed) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck(int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
    }

    @Override
    public double getSalePrice() {
        if(this.weight>2000){
        return super.getRegularPrice() - super.getRegularPrice() * 0.10;     
       }
        
        return super.getRegularPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
   
    
    
}
