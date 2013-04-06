package proxy;
//Զ�̷���
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public MyRemoteImpl()throws RemoteException{}		//UnicastRemoteObject�Ĺ����������׳��쳣�������๹����Ҳ�����׳��쳣

	public String sayHello() {
		
		return "Server Say,'  Hello'";
	}
	public static void main(String[] args) {
		try{
			MyRemote service=new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);//��RMI registry��ע��
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
