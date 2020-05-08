package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	
	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

	public static void main(String[] args) {
		
		LOGGER.info("start");
		LOGGER.debug("{}",Factory.processOrder(ProductType.ElectronicProducts,Channel.ECommerce));
		LOGGER.debug("{}",Factory.processOrder(ProductType.Furniture,Channel.TeleCaller));
		LOGGER.debug("{}",Factory.processOrder(ProductType.Toys,Channel.ECommerce));
		LOGGER.debug("{}",Factory.processOrder(ProductType.Furniture,Channel.ECommerce));
		LOGGER.debug("{}",Factory.processOrder(ProductType.ElectronicProducts,Channel.TeleCaller));
		LOGGER.info("end");
	}

}
