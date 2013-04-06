package templateMethod;

public abstract class DrinkBeverage {
	final void prepareRecipe(){
		boilWater();				//共通
		brew();						//泛化
		pourInCup();				//共通
		if(want()){
			addCondiments();		//泛化
		}
	}

	abstract void brew();				//需要由子类提供的方法，必须在父类中声明为抽象
	abstract void addCondiments();
	void boilWater(){
		System.out.println("煮开水。。。");
	}
	void pourInCup(){
		System.out.println("倒入杯中");
	}
	boolean want(){						//一个hook()方法，子类可以去覆盖，但不一定要去做
		return true;
	}
		
	
}
