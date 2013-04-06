package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends DrinkBeverage {

	@Override
	void addCondiments() {
		System.out.println("加点牛奶，有点小资的感觉。。。");
		
	}

	@Override
	void brew() {
		System.out.println("冲泡咖啡。。。");
		
	}
	public boolean want(){
		String answer=getInput();
		if(answer.startsWith("y")){
			return true;
		}else{
			return false;
		}
	}
	private String getInput(){
		String answer=null;
		System.out.println("你要加点牛奶到咖啡吗  (y/n)?");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
		    answer=in.readLine();
		    }catch(IOException e){
		    	System.err.println("IO 异常");
		    }
		 if(answer==null){
			 return "no";
		 }
		 return answer;
}
}
