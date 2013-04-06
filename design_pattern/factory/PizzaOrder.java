package factory;

public class PizzaOrder {
public static void main(String[] args) {
	PizzaStore nyStore=new NewYorkPizzaStore();
	PizzaStore chicagoStore=new ChicagoPizzaStore();
	Pizza pizza=nyStore.orderPizza("cheese");
	System.out.println("zyg ordered a "+pizza.getName()+"\n");
	pizza=chicagoStore.orderPizza("clam");
	System.out.println("bogute ordered a"+pizza.getName()+"\n");
}
}
