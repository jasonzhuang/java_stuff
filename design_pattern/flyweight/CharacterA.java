package flyweight;

public class CharacterA implements Flyweight{
	public CharacterA(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	private String name;
}
