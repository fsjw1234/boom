package net.fand.cheer.practice05;

import java.util.Scanner;

public class Substr1 {
	public static void main(String args[]){
		Scanner str1=new Scanner(System.in);
		System.out.print("�����һ���ַ����� ");
		String str3=str1.next();
		String Str5=str3.substring(0, 3);
		System.out.println(Str5);
		
		Scanner str2=new Scanner(System.in);
		System.out.print("����ڶ����ַ����� ");
		String str4=str2.next();
		String Str6=str4.substring(0, 3);
		System.out.println(Str6);
		
		if(Str5.equals(Str6)){
			System.out.println("�����Ӵ���ͬ");
		}else{
			System.out.println("�����Ӵ���ͬ");
		}
		str1.close();
		str2.close();
	}

}
