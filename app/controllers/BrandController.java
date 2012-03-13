package controllers;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.model.product.Product;
import com.giltgroupe.model.product.Products;
import com.giltgroupe.model.sale.Sale;
import com.giltgroupe.model.sale.Sales;
import com.giltgroupe.net.GiltFetcher;

import java.util.Collection;
import java.util.List;

import play.*;
import play.mvc.*;

import models.*;

public class BrandController extends Controller {

    public static void showProductsByBrand(String brand) {
        Gilt gilt = GiltFetcher.getInstance();
        //Products products = gilt.getProducts();
		Collection<Product> foundProducts = gilt.findProductsByBrand(brand);
        //List<Product> foundProducts = products.findProductsByBrand(brand);
        render (brand, foundProducts);
    }
}