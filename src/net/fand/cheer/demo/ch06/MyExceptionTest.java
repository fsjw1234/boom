package net.fand.cheer.demo.ch06;

import java.util.Scanner;

public class MyExceptionTest{
	public static void main(String[] args) throws MyException{
		System.out.println("enter your age");
		Scanner scan=null;
		try{
			scan=new Scanner(System.in);
		while(scan.hasNextInt()){
			int age=scan.nextInt();
			if(age==-1){
				break;
			}
			if(age<1||age>120){
				throw new MyException();
			}
		}
		}finally {
			scan.close();
		}
	}
}


class MyException extends Exception{
	public MyException(){
		super("Age should be<=0 and <120");
	}
}
