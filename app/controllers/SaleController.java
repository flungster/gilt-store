package controllers;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.model.product.Product;
import com.giltgroupe.model.sale.Sale;
import com.giltgroupe.model.sale.Sales;
import com.giltgroupe.net.GiltFetcher;

import java.util.List;

import play.*;
import play.mvc.*;

import models.*;

public class SaleController extends Controller {
    
    public static void show() {
        render();
    }

    public static void showSale(String store, String saleKey) {
        Gilt gilt = GiltFetcher.getInstance();
        Sales activeSales = gilt.getActiveSales();
        Sale sale = activeSales.findSaleBySaleKey(saleKey);
        List<Product> products = sale.getProducts();

        notFoundIfNull(sale);
        render(store, sale, products);
    }

    public static void showProductDetail(String store, String saleKey, int productId) {
        Gilt gilt = GiltFetcher.getInstance();
        Sales activeSales = gilt.getActiveSales();
        Sale sale = activeSales.findSaleBySaleKey(saleKey);
        notFoundIfNull(sale);

        Product product = sale.findProductById((long) productId);
        notFoundIfNull(product);

        render(store, sale, product);
    }
}