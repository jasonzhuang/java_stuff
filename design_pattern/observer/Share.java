package observer;

import java.util.ArrayList;
public class Share implements Subject {
	private ArrayList observers;
	private double price;
	public Share(){
		observers=new ArrayList();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
			if(i>=0)
				observers.remove(i);
		}
	public void notifyObserver() {
		for(int i=0;i<observers.size();i++){
			Observer o=(Observer) observers.get(i);
			o.update(price);//��������ݱ仯��ȥ���¹۲��ߣ����ǹ۲����Լ�����
		}
	}
	public void setMeasurement(double price){
		this.price=price;
		notifyObserver();
	}
	
}
