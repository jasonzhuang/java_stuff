package factory;
//字符串传参数类型的习惯不好，输入错误的话会出现null错误,可以用静态常量或枚举
public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type){
		  if(type.equals("cheese")){
			  return new ChicagostyleCheesePizza();
		  }else if(type.equals("veggie")){
			  return new ChicagostyleVeggeiePizza();
		  }else if(type.equals("clam")){
			  return new ChicagostyleClamPizza();
		  }else return null;
	  }
}
