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

public class StoreController extends Controller {

    public static void showStore(String store) {
        Gilt gilt = GiltFetcher.getInstance();
        Sales activeSales = gilt.getActiveSales();
        List<Sale> sales = activeSales.findSalesByStore(store);
        
        render(store, sales);
    }
}