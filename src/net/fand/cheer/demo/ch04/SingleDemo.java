package net.fand.cheer.demo.ch04;

public class SingleDemo {
	public static void main(String[] args){
		Single s=Single.getInstance();
		System.out.println(s.toString());
 	 }

}

class Single{
	private static Single s=new Single();
	private Single(){
		
	}
	public static Single getInstance(){
		return s;
	}
}