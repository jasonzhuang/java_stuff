package elec;

public class TestOrder {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		SaleOrder order=null;
		CalTax caltax=null;
		Member member=null;
		System.out.println("请选择税款类型 ：CanTax,USTax");
		System.out.println("你选择的税款类型是 :"+args[0]);
		Class c1=Class.forName("elec."+args[0]);
		caltax=(CalTax) c1.newInstance();
		System.out.println("请选择你的会员类型 :HighMember,NormalMember");
		System.out.println("你是"+args[1]);
		Class c2=Class.forName("elec."+args[1]);
		member=(Member) c2.newInstance();
		order=new SaleOrder(caltax,member);
		System.out.println("请输入产品数量和价格");
		System.out.println("the quantity and the price is:"+args[2] +"  "+ args[3]);
		System.out.println("税额是："+order.caltax(Integer.parseInt(args[2]),Double.parseDouble(args[3])));
		System.out.println("积分奖励:"+order.gethonor(Double.parseDouble(args[3])));
	}
}
