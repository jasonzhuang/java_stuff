package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;//����
	String sauce;//����
	ArrayList relish=new ArrayList();//����
	public void prepare(){
		System.out.println("׼�� "+name);
		System.out.println("������ ...");
		System.out.println("�ӽ���...");
		System.out.println("������: ");
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
