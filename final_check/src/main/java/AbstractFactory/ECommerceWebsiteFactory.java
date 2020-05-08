package AbstractFactory;

public class ECommerceWebsiteFactory {

	public static Order processOrder(ProductType productType) {

		if(productType==ProductType.ElectronicProducts) {

			 return new ElectronicOrder(Channel.ECommerce);
		}

		else if(productType==ProductType.Furniture) {

			return new FurnitureOrder(Channel.ECommerce);
		}

			return new ToysOrder(Channel.ECommerce);
	}
}
