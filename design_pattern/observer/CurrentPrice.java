package observer;
public class CurrentPrice implements Observer,Display{

	private double currentPrice;
	private Subject share;
	CurrentPrice(Subject share){
		this.share=share;
		share.registerObserver(this);
	}
	public void update(double price) {
		this.currentPrice=price;
		display();
	}
	public void display() {
		System.out.println("当前的股票价格是："+currentPrice);
	}
	public double getCurrentPrice(){
		return currentPrice;
	}

}
