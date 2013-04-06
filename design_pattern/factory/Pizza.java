package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;//面团
	String sauce;//酱料
	ArrayList relish=new ArrayList();//佐料
	public void prepare(){
		System.out.println("准备 "+name);
		System.out.println("揉面团 ...");
		System.out.println("加酱料...");
		System.out.println("加佐料: ");
		for(int i=0;i<relish.size();i++){
			System.out.println("   "+relish.get(i));
		}
	}
	public void bake(){
		System.out.println("Bake for 25  minutes at 350");
	}
	public void cut(){
		System.out.println("Cutting pizza into diagnol slices");
	}
	public String getName(){
		return name;
	}
}
