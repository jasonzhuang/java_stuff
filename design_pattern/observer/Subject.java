package observer;
//趋势预测写法要注意
public interface Subject {
 public void registerObserver(Observer o);
 public void removeObserver(Observer o);
 public void notifyObserver();
}
