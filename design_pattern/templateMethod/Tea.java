package templateMethod;

public class Tea extends DrinkBeverage {

	@Override
	void addCondiments() {
		System.out.println("��������");
	}

	@Override
	void brew() {
		System.out.println("���ݲ�Ҷ");
		
	}

}
