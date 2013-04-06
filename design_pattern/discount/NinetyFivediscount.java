package discount;

public class NinetyFivediscount implements Discount{

	public double discount(double price){
		return price*0.95;
	}
}
