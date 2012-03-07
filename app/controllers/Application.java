package controllers;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.model.sale.Sale;
import com.giltgroupe.model.sale.Sales;
import com.giltgroupe.net.GiltFetcher;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        Gilt gilt = GiltFetcher.getInstance();
        Sales giltActiveSales = gilt.getActiveSales();
        List<Sale> activeSales = giltActiveSales.getSaleList();

        System.out.println("Num of sales: " + activeSales.size());
        render(activeSales);
    }

}