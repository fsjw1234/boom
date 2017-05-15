package net.fand.cheer.demo.ch06;
import static java.lang.System.out;

public class InnerClassTest {
	private int value;
	private void process(){
		out.println("call process");
	}
	class InnerClass{
		public InnerClass(){
			value=101;
			process();
		}
	}

	public static void main(String[] args){
		
	}

}
