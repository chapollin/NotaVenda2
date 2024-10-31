package controller;

import model.Product;
import model.Sale;
import model.SaleItem;

public class SaleController {

    public Sale createSale() {
        Product rice = createProduct("Arroz Tatiana", 30);
        Product beans = createProduct("Feijao Feijo", 20);
        Product pasta = createProduct("Macarrao Santa Amalia", 15);

        SaleItem itemRice = createSaleItem(rice, 2);
        SaleItem itemBeans = createSaleItem(beans, 1);
        SaleItem itemPasta = createSaleItem(pasta, 6);

        Sale sale = new Sale();
        sale.addSaleItem(itemRice);
        sale.addSaleItem(itemBeans);
        sale.addSaleItem(itemPasta);

        return sale;
    }

    private Product createProduct(String description, double price) {
        Product product = new Product();
        product.setDescription(description);
        product.setPrice(price);
        return product;
    }

    private SaleItem createSaleItem(Product product, int quantity) {
        SaleItem item = new SaleItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        return item;
    }
}
