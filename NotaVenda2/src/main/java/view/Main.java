package view;

import controller.SaleController;
import model.Sale;
import model.SaleItem;

public class Main {
    public static void main(String[] args) {
        SaleController controller = new SaleController();
        Sale sale = controller.createSale();

        for (SaleItem item : sale.getItems())
            System.out.println(item);

        System.out.println(String.format("Total: %.2f", sale.getTotal()));
    }
}
