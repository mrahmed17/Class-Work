package product;

public class Product {

    private String name;
    private double regularPrice;

    public Product() {
    }

    public Product(String name, double regularPrice) {
        this.name = name;
        this.regularPrice = regularPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

//    public double product(String name, double regularPrice) {
//        return regularPrice;
//    }
    public double getSalePrice() {
        return regularPrice;
    }

}
