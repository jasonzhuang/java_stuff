package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends DrinkBeverage {

	@Override
	void addCondiments() {
		System.out.println("�ӵ�ţ�̣��е�С�ʵĸо�������");
		
	}

	@Override
	void brew() {
		System.out.println("���ݿ��ȡ�����");
		
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
		System.out.println("��Ҫ�ӵ�ţ�̵�������  (y/n)?");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try{
		    answer=in.readLine();
		    }catch(IOException e){
		    	System.err.println("IO �쳣");
		    }
		 if(answer==null){
			 return "no";
		 }
		 return answer;
}
}
