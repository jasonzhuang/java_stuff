package proxy;
//远程接口
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	public String sayHello()throws RemoteException;    	//涉及到网络和I/O,“是有风险的”
														//变量和返回值是primitive或serializable
}
