package templateMethod;

public class Test {
	public static void main(String[] args) {
		DrinkBeverage tea=new Tea();
		DrinkBeverage coffee=new Coffee();
		System.out.println("����Ϊ�����һ�����,��ȴ�������");
		tea.prepareRecipe();
		System.out.println();
		System.out.println();
		System.out.println("����Ϊ����ƿ��ȣ���ȴ�������");
		coffee.prepareRecipe();
	}
}
