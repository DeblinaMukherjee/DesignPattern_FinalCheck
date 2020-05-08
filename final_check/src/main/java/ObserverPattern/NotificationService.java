package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	
	private List<INotificationObserver> observer = new ArrayList<INotificationObserver>();
	
	public void AddObserver(INotificationObserver nObserver) {
		observer.add(nObserver);
		LOGGER.info("start");
		LOGGER.debug("{}",observer);
		LOGGER.info("end");
	}

	
	public void RemoveObserver(INotificationObserver nObserver) {
		observer.remove(nObserver);
		LOGGER.info("start");
		LOGGER.debug("{}",observer);
		LOGGER.info("end");
	}

	
	public void NotifyObserver() {
		for (INotificationObserver ob : observer) {
			if (ob.getNoOfTickets() > 100) {
				ob.nofication();
			}
		}

		
	}

}
