package flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory factory=new FlyweightFactory();
		Flyweight flyweight1=factory.getFlyweight("A");
		Flyweight flyweight2=factory.getFlyweight("A");
		Flyweight flyweight3=factory.getFlyweight("C");
		Flyweight flyweight4=factory.getFlyweight("B");
		Flyweight flyweight5=factory.getFlyweight("C");
		System.out.println(flyweight1.getName()+flyweight2.getName()+flyweight3.getName()
				+flyweight4.getName()+flyweight5.getName());
	}
}
