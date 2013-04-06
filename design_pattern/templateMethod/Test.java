package templateMethod;

public class Test {
	public static void main(String[] args) {
		DrinkBeverage tea=new Tea();
		DrinkBeverage coffee=new Coffee();
		System.out.println("正在为你调制一杯香茶,请等待。。。");
		tea.prepareRecipe();
		System.out.println();
		System.out.println();
		System.out.println("正在为你调制咖啡，请等待。。。");
		coffee.prepareRecipe();
	}
}
