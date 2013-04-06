package factory;
public class NewYorkPizzaStore extends PizzaStore {
  public Pizza createPizza(String type){
	  if(type.equals("cheese")){
		  return new NYstyleCheesePizza();
	  }else if(type.equals("veggie")){
		  return new NYstyleVeggeiePizza();
	  }else if(type.equals("clam")){
		  return new NYstyleClamPizza();
	  }else return null;
  }
}
