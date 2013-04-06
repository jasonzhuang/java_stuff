package decorator;

public class Milk extends CondimentDecorator {
		Beverage beverage;
		public Milk(Beverage beverage){
			this.beverage=beverage;
		}
	public String getDescription() {
		return beverage.getDiscription()+", Milk";
	}

	@Override
	public double cost() {
		
		return 0.3+beverage.cost();
	}

}
