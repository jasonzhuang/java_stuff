package facade;

public class Amplifier {
	int v;
	public void setVolumes(int v){
		this.v=v;
		System.out.println("�������ó�"+v+"...");
	}
	public void off(){
		System.out.println("�ر�������");
	}
}
