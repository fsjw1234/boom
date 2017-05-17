package net.fand.cheer.home170517;

public class MyException1 extends Exception{
	String message;
	public MyException1(String ErrorMessage){
		message=ErrorMessage;
	}
	public String getMessage(){
		return message;
	}

}
