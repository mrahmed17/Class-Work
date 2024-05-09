package productmanagement;

import product.ElectronicProcduct;

public class ProductManagement {

    public static void main(String[] args) {

        ElectronicProcduct electronicProcduct = new ElectronicProcduct(2, "Red", 5300);

        System.out.println(electronicProcduct.getSalePrice());

    }

}
