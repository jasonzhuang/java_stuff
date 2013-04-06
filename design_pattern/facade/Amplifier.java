package facade;

public class Amplifier {
	int v;
	public void setVolumes(int v){
		this.v=v;
		System.out.println("音量设置成"+v+"...");
	}
	public void off(){
		System.out.println("关闭扩音器");
	}
}
