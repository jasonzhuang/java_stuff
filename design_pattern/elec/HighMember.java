package elec;
//高级会员积分是购物价格的0.85
public class HighMember implements Member{
		public double honor(double price){
			double honor=price*0.25;
			return honor;
		}
}
