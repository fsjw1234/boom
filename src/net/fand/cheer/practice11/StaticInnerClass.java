package net.fand.cheer.practice11;

public class StaticInnerClass {
	static int x=100;
	static class Inner{
		void doitInner(){
			System.out.println(x);
		}
		public static void main(String[] args){
			System.out.println("a");
			System.out.println(x);
		}
	}

}
