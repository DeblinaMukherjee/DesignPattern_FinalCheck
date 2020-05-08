package AbstractFactory;

public class Factory {

	public static Order processOrder(ProductType productType,Channel channel) {

		if(channel==Channel.TeleCaller){

			return TeleCallerAgentFactory.processOrder(productType);
		}
		else{

			return ECommerceWebsiteFactory.processOrder(productType);
		}
	}
}
