package discount;

public class Halfdiscount implements Discount{
	public double discount(double price){
		return price*0.5;
	}
}