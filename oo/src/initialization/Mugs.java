package initialization;
class Mug
{
	
	Mug(int marker)
	{
		System.out.println("Mug("+marker+")");
	    
	}

}
public class Mugs {

	 Mug mug1;
	 Mug mug2;
	 //an instance initialization block, runs once every time a class instance us created,
	 //it runs right after the call to super() in a constructor
	{
		mug1=new Mug(1);
		mug2=new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}
	//a static initialization block, runs once when the class is first loaded
	static {
	    new Mug(3);
	}
	Mugs()
	{
		System.out.println("Mugs()");
	}
	Mugs(int marker)
	{
		System.out.println("Mugs("+marker+")");
	}
	 public static void main(String[] args)
	 {
		 System.out.println("new Mugs() complete");
		 	new Mugs(4);
		 System.out.println("new Mugs(int) complete");
	 }
}
