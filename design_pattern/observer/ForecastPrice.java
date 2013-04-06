package observer;

import java.util.Random;

//û����������Ԥ�⣬��Ҫ���ݵ���ǰ�䶯ֵ��Ԥ��
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
			System.out.println("���ƻ������ˡ������� �ɼۻ����ǣ��Ͻ���Ͷ��");
		else if(forePrice<price)
		{
			System.out.println("ע���ˣ����ɼۻ�ص����������Ͷ��");
		}
		else 
			display();
	}

	public void display() {
		System.out.println("����ƽ�ȡ���������");
	}

}
