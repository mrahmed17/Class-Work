package productmanagement;

public class ProductManagement {

    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct(2, "Laptop", 150000.0);
        System.out.println("Sale price of laptop: $" + laptop.getSalePrice());
        ElectronicProduct phone = new ElectronicProduct(1, "iPhone", 140000);

        System.out.println("Sale price of Phone: $" + phone.getSalePrice());
    }

}
