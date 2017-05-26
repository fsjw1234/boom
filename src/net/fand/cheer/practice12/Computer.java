package net.fand.cheer.practice12;

public class Computer {

	public static void main(String[] args) {
		try{
			int result=chu(8,0);
			//System.out.println(result);
		}catch(MyException e){
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

		public static int chu(int m,int n) throws MyException{
			if(n==0){
				throw new MyException("³ýÊýÎª0");
			}
			return m/n;
		}
}
	class MyException1 extends Exception{
		public MyException1(String Error){
			super(Error);
		}
	}

