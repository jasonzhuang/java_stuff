package decorator;

public class StarBuzz {

	public static void main(String[] args) {
	Beverage beverage=new Espresso();
	System.out.println(beverage.getDiscription()+"  $ "+beverage.cost());
	Beverage beverage2=new DarkRost();
	beverage2=new Mocha(beverage2);
	beverage2=new Mocha(beverage2);
	beverage2=new Whip(beverage2);
	System.out.println(beverage2.getDiscription()+" $ "+beverage2.cost());
	Beverage beverage3=new HouseBlend();
	beverage3=new Whip(new Mocha(new Soy(beverage3)));//用whip,soy,mocha为调料
	System.out.println(beverage3.getDiscription()+" $ "+beverage3.cost());
}
}
