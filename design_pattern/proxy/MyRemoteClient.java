package proxy;

import java.rmi.Naming;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	public void go()
	{
		try{
			MyRemote service=(MyRemote)Naming.lookup("rmi://127.0.0.1/RemoteHello");//客户到RMI registry中寻找，获取stub，RMI自动对stub反序列化
			String s=service.sayHello();
			System.out.println(s);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
/*
 * 工作流程：
 * Client寻找RemoteHello,RMI registry返回代理，Client调用sayHello
 * 代理上的sayHello()被调用，此调用被转发到远程服务，Skeleton接收请求，然后转发给MyRemoteImpl
 * MyRemoteImpl将结果返回给skeleton,skeleton将结果序列化，通过网络传回给代理，代理将其反序列化，返回给client
 * 
 * 
 * 
 * 
 * 
 * 
 */





