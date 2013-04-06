package singleton;

public class ChocolateBoilers {
private boolean empty;
private boolean boiled;
public volatile static ChocolateBoilers uniqueInstance;  //˫�ؼ���
private ChocolateBoilers(){
	empty=true;
	boiled=true;
}
public static  ChocolateBoilers getInstance(){
	if(uniqueInstance==null){			//���ʵ������������ھͽ���ͬ����
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
		//�ڹ�¯������ɿ�����ţ��
	}
}
public void drain(){
	if(!isEmpty()&&!isBoiled()){
		//�ų���е�ţ�̺��ɿ���
		empty=true;
	}
}
public void boil(){
	if(!isEmpty()&&!isBoiled())
		//��¯�ڵ��ɿ�����ţ�����
		boiled=true;
}
public boolean isEmpty(){
	return true;
}
public boolean isBoiled(){
	return true;
}

}
