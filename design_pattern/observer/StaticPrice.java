package observer;

import java.util.Arrays;
import java.util.Random;
public class StaticPrice implements Observer,Display{
	private double highestPrice,lowestPrice,averagePrice;
	private  final static double STATICPRICE=30;//���ô˱�����Ϊ������͹ɼ۸�����ʵ�����壬��Ϊ�������ֵͨ���������Сֵ����0~5֮��
	private double[] randomPrice=new double[30];
	private Subject share;
	private Arrays list;    
	Random r=new Random();
	public StaticPrice(Subject share){
		this.share=share;
		share.registerObserver(this);
	}
	//------------price����û���õ���Ҳ����Ҫ��
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
	System.out.println("��߼۸�"+highestPrice+"ƽ���۸�"+averagePrice+"��ͼ۸�: "+lowestPrice);
		
	}
}
