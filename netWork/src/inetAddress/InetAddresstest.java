package inetAddress;

import java.net.InetAddress;

public class InetAddresstest {
	public static void main(String[] args) {
		try {
			if (args.length > 0) {
				String host = args[0];
				InetAddress[] address = InetAddress.getAllByName(host);
				for (InetAddress a : address) {
					System.out.println(a);
				}
			} else {
				InetAddress localHostAddress = InetAddress.getLocalHost();
				System.out.println(localHostAddress);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
