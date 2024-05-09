package product;

public class ElectronicProcduct extends Product {

    private int warrantyPeriod;

    public ElectronicProcduct() {
    }

    public ElectronicProcduct(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public ElectronicProcduct(int warrantyPeriod, String name, double regularPrice) {
        super(name, regularPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double getSalePrice() {

        if (this.warrantyPeriod > 1) {
            return super.getRegularPrice() - super.getRegularPrice() * 0.15;
        }

        return super.getRegularPrice(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
