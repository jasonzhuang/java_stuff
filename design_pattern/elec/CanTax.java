package elec;
//Cantax=itemSold*price*0.20
public class CanTax implements CalTax {

	public double taxAmount(int itemSold, double price) {
		return itemSold*price*0.20;
	}

}
