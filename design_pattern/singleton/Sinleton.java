package singleton;

public class Sinleton{
	private static Sinleton[] uniqueInstance;
	private Sinleton(){}
	public static synchronized Sinleton[] getInstance(int count){	 	//同步getInstance()可以有效处理多线程问题
		uniqueInstance=new Sinleton[count];//注意数组越界
		for(int i=0;i<count;i++){
	uniqueInstance[i]=new Sinleton();
	}
	return uniqueInstance;
	}
	public static void main(String[] args) {
		Sinleton.getInstance(3);
	}
}
