package templateMethod;

public abstract class DrinkBeverage {
	final void prepareRecipe(){
		boilWater();				//��ͨ
		brew();						//����
		pourInCup();				//��ͨ
		if(want()){
			addCondiments();		//����
		}
	}

	abstract void brew();				//��Ҫ�������ṩ�ķ����������ڸ���������Ϊ����
	abstract void addCondiments();
	void boilWater(){
		System.out.println("��ˮ������");
	}
	void pourInCup(){
		System.out.println("���뱭��");
	}
	boolean want(){						//һ��hook()�������������ȥ���ǣ�����һ��Ҫȥ��
		return true;
	}
		
	
}
