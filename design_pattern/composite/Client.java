package composite;

public class Client {
	public static void main(String[] args) {
		CompositeDepartment organ=new CompositeDepartment();
		organ.add(new Department1());
		organ.add(new Department2());
		System.out.println("组织的总人数："+organ.personCount());
		
	}
}	
