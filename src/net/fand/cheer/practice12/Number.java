package net.fand.cheer.practice12;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			int result=count(8,0);
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

	public static int count(int m,int n){
		return m+n;
	}
}
