package net.fand.cheer.home170620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8081);
		System.out.println("server start");
		Socket socket = serverSocket.accept();
		System.out.println("client connect");

		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		while (run) {
			String income = in.readLine();
			System.out.println("clent sent me: " + income);
			System.out.println("enter reply: ");
			String outgo = scanner.nextLine();
			if ("bye".equals(outgo)) {
				run = false;
				out.println(outgo);
			} else {
				out.println(outgo);
			}

		}
		scanner.close();
		socket.close();
		serverSocket.close();
	}
}
