package decorator;

public abstract class Beverage {
	String description="Unknown Beverage";
	public String getDiscription(){
		return description;
	}
	public abstract double cost();
	
}
