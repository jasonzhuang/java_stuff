package observer;

import java.util.Random;

//没有真正做到预测，需要根据但当前变动值来预测
public class ForecastPrice implements Observer,Display{
	private Subject share;
	private CurrentPrice cp;
	double forePrice;
	Random r=new Random();
	public ForecastPrice(Subject share){
		this.share=share;
		share.registerObserver(this);
	}
	public void update(double price) {
		forePrice=r.nextDouble()*75;
		if(forePrice>price)
			System.out.println("发财机会来了。。。。 股价会上涨，赶紧多投资");
		else if(forePrice<price)
		{
			System.out.println("注意了！！股价会回跌，股民谨慎投资");
		}
		else 
			display();
	}

	public void display() {
		System.out.println("股市平稳。。。。。");
	}

}
