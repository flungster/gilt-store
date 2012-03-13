package jobs;

import com.giltgroupe.model.Gilt;
import com.giltgroupe.net.GiltFetcher;

import play.jobs.*;

@OnApplicationStop
public class Shutdown extends Job {
    
    public void doJob() {
        System.out.println("Shutting down..");

		Gilt gilt = GiltFetcher.getInstance();
        gilt.shutdown();
		
        System.out.println("Shut down.");
    }
    
}