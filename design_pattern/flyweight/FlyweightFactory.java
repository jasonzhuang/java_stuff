package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {
		private List list=new ArrayList();
		public Flyweight getFlyweight(String name){
			Flyweight flyweight=null;
			for(int i=0;i<list.size();i++){
				flyweight=(Flyweight)list.get(i);
				if(name.equals(flyweight.getName())){
					System.out.println(name+"被直接获取");
					break;
				}else{
					flyweight=null;
				}
			}
			if(flyweight==null){
				if("A".equals(name)){
					flyweight=new CharacterA(name);
				}else if("B".equals(name)){
					flyweight=new CharacterB(name);
				}else if("C".equals(name)){
					flyweight=new CharacterC(name);
				}
				System.out.println(name+"被创建");
				list.add(flyweight);
			}
			return flyweight;
		}
}
