package AbstractFactory;

public class TeleCallerAgentFactory {

	public static Order processOrder(ProductType productType) {

		if(productType==ProductType.ElectronicProducts) {

			 return new ElectronicOrder(Channel.TeleCaller);
		}

		else if(productType==ProductType.Furniture) {

			return new FurnitureOrder(Channel.TeleCaller);
		}

			return new ToysOrder(Channel.TeleCaller);
	}
}
