package flyweight;

public class CharacterB implements Flyweight{
	public CharacterB(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	private String name;
}
