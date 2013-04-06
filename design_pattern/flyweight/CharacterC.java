package flyweight;

public class CharacterC implements Flyweight {
	
	public CharacterC(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	private String name;

}
