package productmanagement;

public class ElectronicProduct extends Product {

    private int warrantyPeriod;

    public ElectronicProduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getSalePrice() {

        if (warrantyPeriod > 1) {
            return regularPrice * 0.85;
        } else {
            return regularPrice;
        }
        return super.regularPrice; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
