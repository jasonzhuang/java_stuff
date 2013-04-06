package discount;

public abstract class Print {
	Discount disc;
	public double performDis(double price){
		return disc.discount(price);
	}
	public void setDiscount(Discount dc){
		disc=dc;
	}
	public abstract double getPrice();
	public abstract void say();
}
