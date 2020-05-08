package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ToysOrder extends Order{

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(ToysOrder.class);
	
	public ToysOrder(Channel channel) {
		super(ProductType.Toys, channel);
		processOrder();
	}

	@Override
	public void processOrder() {
		LOGGER.info("start");
		LOGGER.debug("Order request for toys is successful");
		LOGGER.info("end");
		
	}

	
}
