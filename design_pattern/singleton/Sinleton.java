package singleton;

public class Sinleton{
	private static Sinleton[] uniqueInstance;
	private Sinleton(){}
	public static synchronized Sinleton[] getInstance(int count){	 	//ͬ��getInstance()������Ч������߳�����
		uniqueInstance=new Sinleton[count];//ע������Խ��
		for(int i=0;i<count;i++){
	uniqueInstance[i]=new Sinleton();
	}
	return uniqueInstance;
	}
	public static void main(String[] args) {
		Sinleton.getInstance(3);
	}
}
