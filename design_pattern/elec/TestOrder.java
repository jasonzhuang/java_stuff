package elec;

public class TestOrder {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		SaleOrder order=null;
		CalTax caltax=null;
		Member member=null;
		System.out.println("��ѡ��˰������ ��CanTax,USTax");
		System.out.println("��ѡ���˰�������� :"+args[0]);
		Class c1=Class.forName("elec."+args[0]);
		caltax=(CalTax) c1.newInstance();
		System.out.println("��ѡ����Ļ�Ա���� :HighMember,NormalMember");
		System.out.println("����"+args[1]);
		Class c2=Class.forName("elec."+args[1]);
		member=(Member) c2.newInstance();
		order=new SaleOrder(caltax,member);
		System.out.println("�������Ʒ�����ͼ۸�");
		System.out.println("the quantity and the price is:"+args[2] +"  "+ args[3]);
		System.out.println("˰���ǣ�"+order.caltax(Integer.parseInt(args[2]),Double.parseDouble(args[3])));
		System.out.println("���ֽ���:"+order.gethonor(Double.parseDouble(args[3])));
	}
}
