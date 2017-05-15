package net.fand.cheer.practice05;

import java.util.Scanner;

public class Substr1 {
	public static void main(String args[]){
		Scanner str1=new Scanner(System.in);
		System.out.print("输入第一个字符串： ");
		String str3=str1.next();
		String Str5=str3.substring(0, 3);
		System.out.println(Str5);
		
		Scanner str2=new Scanner(System.in);
		System.out.print("输入第二个字符串： ");
		String str4=str2.next();
		String Str6=str4.substring(0, 3);
		System.out.println(Str6);
		
		if(Str5.equals(Str6)){
			System.out.println("两个子串相同");
		}else{
			System.out.println("两个子串不同");
		}
		str1.close();
		str2.close();
	}

}
