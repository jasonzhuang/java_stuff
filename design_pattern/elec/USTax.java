package elec;
//UStax=�۸�*����*0.15
public class USTax implements CalTax{
	public double taxAmount(int itemSold,double price){
		return price*itemSold*0.15;
	}
		
}
