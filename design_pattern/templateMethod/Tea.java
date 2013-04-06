package templateMethod;

public class Tea extends DrinkBeverage {

	@Override
	void addCondiments() {
		System.out.println("Ôö¼ÓÄûÃÊ");
	}

	@Override
	void brew() {
		System.out.println("½şÅİ²èÒ¶");
		
	}

}
