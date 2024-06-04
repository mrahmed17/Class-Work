
package productmanagement;

public class Product {
    private String name;
    private double regularPrice;

    public Product() {
    }

    public Product(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }
    
    
 public double getSalePrice(){
 
 return regularPrice;
 }
    
}
