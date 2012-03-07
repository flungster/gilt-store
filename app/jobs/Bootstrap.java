package jobs;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.net.GiltFetcher;

import play.jobs.*;

@OnApplicationStart
public class Bootstrap extends Job {
    
    public void doJob() {
        System.out.println("loading sales");
        Gilt gilt = GiltFetcher.getInstance();
        gilt.setApiKey("5aa7344bd866dd8128b82bb868811442");
        gilt.start();

        System.out.println("Finished loading");
    }
    
}