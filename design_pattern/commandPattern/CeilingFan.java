package commandPattern;

//This is Receiver
public class CeilingFan {
	public static final int HIGH = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private int speed = 0;
	
	public CeilingFan() {
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println("Ceiling fan is on high");
	}

	public void low() {
		speed = LOW;
		System.out.println("Ceiling fan is on low");
	}
	
	public void off() {
		speed = OFF;
		System.out.println("Ceiling fan is off");
	}
	
	public int getSpeed() {
		return speed;
	}
}
