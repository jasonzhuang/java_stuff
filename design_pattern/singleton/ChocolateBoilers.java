package singleton;

public class ChocolateBoilers {
private boolean empty;
private boolean boiled;
public volatile static ChocolateBoilers uniqueInstance;  //双重加锁
private ChocolateBoilers(){
	empty=true;
	boiled=true;
}
public static  ChocolateBoilers getInstance(){
	if(uniqueInstance==null){			//检查实例，如果不存在就进入同步区
		synchronized(ChocolateBoilers.class){
	if(uniqueInstance==null){
		uniqueInstance=new ChocolateBoilers();
	}
}
}
	return uniqueInstance;
}
public void fill(){
	if(isEmpty()){
		empty=false;
		boiled=false;
		//在锅炉内填充巧克力和牛奶
	}
}
public void drain(){
	if(!isEmpty()&&!isBoiled()){
		//排出煮沸的牛奶和巧克力
		empty=true;
	}
}
public void boil(){
	if(!isEmpty()&&!isBoiled())
		//将炉内的巧克力和牛奶煮沸
		boiled=true;
}
public boolean isEmpty(){
	return true;
}
public boolean isBoiled(){
	return true;
}

}
