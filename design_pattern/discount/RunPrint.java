package discount;

public class RunPrint {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Print print=null;
		Discount discount=null;
		System.out.println("欢迎光临xx打印机销售店，.........");
		System.out.println("请输入要购买的打印机类型：Huashuo,Sony,Canon");
		System.out.println("你要购买的打印机是  "+args[0]);
		Class c1=  Class.forName("discount."+args[0]);
		print=(Print)c1.newInstance();
		System.out.println(args[0]+"原价 "+print.getPrice());
	//	print.newInstance().performDis();
		System.out.println("请输入折扣类型：HalfdisCount，Nodiscount,Ninetyfivediscount");
		System.out.println("你选择的折扣类型是  "+args[1]);
		Class c2=Class.forName("discount."+args[1]);
		discount=(Discount)c2.newInstance();
		print.setDiscount(discount);
		print.say();
		System.out.println("最终价格是"+print.performDis(print.getPrice()));
		//print.newInstance();
		
		
		
		
		
	}

}
