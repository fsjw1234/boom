package net.fand.cheer.demo.ch05;

public class Demo2 {
	public static void main(String[] args){
		Test test=new Test();
		System.out.println(test);
		
		String a="abc";
		System.out.println(a.hashCode());
	}
}

class Test{
	public String toString(){
		return "test";
	}
	
}