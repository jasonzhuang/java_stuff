package observer;

import java.util.Random;

public class RunShare {
	
	public static void main(String[] args) {
		double[] currentPrice=new double[30];
		Random r=new Random();
		for(int i=0;i<30;i++){
			currentPrice[i]=r.nextDouble()*65;
		}
		Share share=new Share();
		CurrentPrice cp=new CurrentPrice(share);
		StaticPrice ap=new StaticPrice(share);
		ForecastPrice fore=new ForecastPrice(share);
		for(int i=0;i<30;i++)
		share.setMeasurement(currentPrice[i]);
	}

}
