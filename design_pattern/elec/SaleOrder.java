package elec;

public  class SaleOrder {
	
	CalTax cal;
	Member mb;
	public  double caltax(int itemSold,double price){
		return cal.taxAmount( itemSold, price);
	}
	public double gethonor(double price){
		return mb.honor(price);
	}
	public SaleOrder(CalTax cal,Member mb){
		this.cal=cal;
		this.mb=mb;
	}
	
}
