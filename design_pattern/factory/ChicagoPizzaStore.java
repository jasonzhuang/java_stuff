package factory;
//�ַ������������͵�ϰ�߲��ã��������Ļ������null����,�����þ�̬������ö��
public class ChicagoPizzaStore extends PizzaStore {
	public Pizza createPizza(String type){
		  if(type.equals("cheese")){
			  return new ChicagostyleCheesePizza();
		  }else if(type.equals("veggie")){
			  return new ChicagostyleVeggeiePizza();
		  }else if(type.equals("clam")){
			  return new ChicagostyleClamPizza();
		  }else return null;
	  }
}
