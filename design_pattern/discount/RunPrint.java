package discount;

public class RunPrint {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Print print=null;
		Discount discount=null;
		System.out.println("��ӭ����xx��ӡ�����۵꣬.........");
		System.out.println("������Ҫ����Ĵ�ӡ�����ͣ�Huashuo,Sony,Canon");
		System.out.println("��Ҫ����Ĵ�ӡ����  "+args[0]);
		Class c1=  Class.forName("discount."+args[0]);
		print=(Print)c1.newInstance();
		System.out.println(args[0]+"ԭ�� "+print.getPrice());
	//	print.newInstance().performDis();
		System.out.println("�������ۿ����ͣ�HalfdisCount��Nodiscount,Ninetyfivediscount");
		System.out.println("��ѡ����ۿ�������  "+args[1]);
		Class c2=Class.forName("discount."+args[1]);
		discount=(Discount)c2.newInstance();
		print.setDiscount(discount);
		print.say();
		System.out.println("���ռ۸���"+print.performDis(print.getPrice()));
		//print.newInstance();
		
		
		
		
		
	}

}
