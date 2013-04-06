package observer;

import java.util.Arrays;
import java.util.Random;
public class StaticPrice implements Observer,Display{
	private double highestPrice,lowestPrice,averagePrice;
	private  final static double STATICPRICE=30;//设置此变量是为了让最低股价更符合实际意义，因为不加这个值通常情况下最小值会在0~5之间
	private double[] randomPrice=new double[30];
	private Subject share;
	private Arrays list;    
	Random r=new Random();
	public StaticPrice(Subject share){
		this.share=share;
		share.registerObserver(this);
	}
	//------------price参数没有用到，也不需要用
	public void update(double price) {
		highestPrice=highPrice();
		lowestPrice=lowPrice();
		averagePrice=avePrice();
		display();
	}
	private double avePrice() {
		double sum=0;
		double avg;
		for(int i=0;i<30;i++){
			randomPrice[i]=r.nextDouble()*100;
			sum+=randomPrice[i];
		}
		avg=sum/30;
		return avg;
	}
	private double lowPrice() {
		for(int i=0;i<30;i++){
			randomPrice[i]=r.nextDouble()*100;	
		}
		list.sort(randomPrice);
		return (randomPrice[0]+STATICPRICE);
	}
	private double highPrice() {
		for(int i=0;i<30;i++){
			randomPrice[i]=r.nextDouble()*100;	
		}
		list.sort(randomPrice);
		return randomPrice[29];
		
	}
	public void display() {
	System.out.println("最高价格："+highestPrice+"平均价格"+averagePrice+"最低价格: "+lowestPrice);
		
	}
}
