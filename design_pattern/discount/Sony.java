package discount;

public class Sony  extends Print{
	final double PRICE=3600;
	public void say(){
		System.out.println("我是Sony打印机");
	}

	
	public double getPrice() {
		return PRICE;
	}
}
