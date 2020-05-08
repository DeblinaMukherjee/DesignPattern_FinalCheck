package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FurnitureOrder extends Order{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(FurnitureOrder.class);
	
	public FurnitureOrder(Channel channel) {
		super(ProductType.Furniture, channel);
		processOrder();
	}

	@Override
	public void processOrder() {
		LOGGER.info("start");
		LOGGER.debug("Order request for furniture is successful");
		LOGGER.info("end");
		
	}
	

	
}
