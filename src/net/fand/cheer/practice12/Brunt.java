package net.fand.cheer.practice12;

public class Brunt {
	public static void main(String[] args) {
		Student stu = new Student();
		try {
			stu.speak(1500);
		} catch (MyException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

class Student {
	public void speak(int m) throws MyException {
		if (m > 1000) {
			throw new MyException("参数太大了");
		}
	}
}

/*class MyException extends Exception {
	String message;
	public MyException(String ErrorMessage) {
		message = ErrorMessage;
	}
	public String getMessage() {
		return message;
	}
}*/
class MyException extends Exception{
	public MyException(String ErrorMessage){
		super(ErrorMessage);
	}
}