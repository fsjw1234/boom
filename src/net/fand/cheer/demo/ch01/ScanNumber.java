package net.fand.cheer.demo.ch01;

import java.util.Scanner;

public class ScanNumber {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ����ֵ");
		
		String str1 = scan.next();
		System.out.println(str1);
		scan.close();	
	}
}