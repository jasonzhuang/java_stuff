package utility;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTrack {
public static void trackUseCases(List<Integer> useCases,Class<?> cl){
	for(Method m:cl.getDeclaredMethods()){
		UseCase uc=m.getAnnotation(UseCase.class);
		if(uc!=null){
			System.out.println("ÕÒµ½use case:"+uc.id()+"  "+uc.say());
			useCases.remove(new Integer(uc.id()));
		}
	}
	for(int i:useCases){
		System.out.println("¾¯¸æ:missing use case-"+i);
	}
}
	public static void main(String[] args) {
		List<Integer> useCases=new ArrayList<Integer>();
		Collections.addAll(useCases,16,17,18);
		trackUseCases(useCases,PasswordUtil.class);
}
}
