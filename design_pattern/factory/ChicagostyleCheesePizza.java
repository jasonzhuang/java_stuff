package factory;

public class ChicagostyleCheesePizza extends Pizza {
	public ChicagostyleCheesePizza(){
		name="CHicago Style deep dish  cheeese pizza";
		dough="Extra Thick Dough";
		sauce="Plum Tomato Sauce";
		relish.add("Shredded Mozzarella Cheese");
	}
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
