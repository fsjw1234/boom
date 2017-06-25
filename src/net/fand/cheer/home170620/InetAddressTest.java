package net.fand.cheer.home170620;

import java.net.InetAddress;

public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress local=InetAddress.getLocalHost();
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
	}
}
