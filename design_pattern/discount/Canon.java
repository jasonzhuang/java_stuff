package discount;

public class Canon  extends Print{
	final double PRICE=2500;
	public void say(){
		System.out.println("我是Canon打印机");
	}

	
	public double getPrice() {
		return PRICE;
	}
}
