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
			o.update(price);//主题的数据变化后，去更新观察者，并非观察者自己更新
		}
	}
	public void setMeasurement(double price){
		this.price=price;
		notifyObserver();
	}
	
}
