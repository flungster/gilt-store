package controllers;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.model.product.Product;
import com.giltgroupe.model.product.Products;
import com.giltgroupe.model.sale.Sale;
import com.giltgroupe.model.sale.Sales;
import com.giltgroupe.net.GiltFetcher;

import java.util.List;

import play.*;
import play.mvc.*;

import models.*;

public class ProductController extends Controller {

    public static void show(int productId) {
        Gilt gilt = GiltFetcher.getInstance();
        Products products = gilt.getProducts();
        Product product = products.getProduct((long)productId);

        render (product);
    }
}