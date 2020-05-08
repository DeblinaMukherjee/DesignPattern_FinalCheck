package AbstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElectronicOrder extends Order{
	
	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}
	private static final Logger LOGGER = LoggerFactory.getLogger(ElectronicOrder.class);

	public ElectronicOrder(Channel channel) {
		super(ProductType.ElectronicProducts, channel);
		processOrder();
	}

	@Override
	public void processOrder() {
		LOGGER.info("start");
		LOGGER.debug("Order request for electronic products is successful");
		LOGGER.info("end");
	}
	
	

}
