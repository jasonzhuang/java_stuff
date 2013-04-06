package proxy;
//远程服务
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
	public MyRemoteImpl()throws RemoteException{}		//UnicastRemoteObject的构造器方法抛出异常，故子类构造器也必须抛出异常

	public String sayHello() {
		
		return "Server Say,'  Hello'";
	}
	public static void main(String[] args) {
		try{
			MyRemote service=new MyRemoteImpl();
			Naming.rebind("RemoteHello", service);//在RMI registry中注册
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
