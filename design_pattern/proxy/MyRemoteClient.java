package proxy;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	public void go()
	{
		try{
			MyRemote service=(MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");//�ͻ���RMI registry��Ѱ�ң���ȡstub��RMI�Զ���stub�����л�
			String s=service.sayHello();
			System.out.println(s);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
/*
 * �������̣�
 * ClientѰ��RemoteHello,RMI registry���ش���Client����sayHello
 * �����ϵ�sayHello()�����ã��˵��ñ�ת����Զ�̷���Skeleton��������Ȼ��ת����MyRemoteImpl
 * MyRemoteImpl��������ظ�skeleton,skeleton��������л���ͨ�����紫�ظ����������䷴���л������ظ�client
 * 
 * 
 * 
 * 
 * 
 * 
 */





