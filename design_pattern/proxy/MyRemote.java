package proxy;
//Զ�̽ӿ�
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote{
	public String sayHello()throws RemoteException;    	//�漰�������I/O,�����з��յġ�
														//�����ͷ���ֵ��primitive��serializable
}
