package ObserverPattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdminObserver extends INotificationObserver{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminObserver.class);
	
		public AdminObserver(INotificationService service, String name, int noOfTickets) {
				super(service, name, noOfTickets);
			}

			@Override
			public void nofication() {
				LOGGER.info("start");
				LOGGER.debug("Hello " + name + " . More than 100 tickets have been booked for this event.");
				LOGGER.info("end");
			}
		}