package net.fand.cheer.home170517;

public class Captor {
	static int quotient(int x,int y)throws MyException1{
		if(y<0){
			throw new MyException1("除数不能是负数");
		}
		return x/y;
	}
	public static void main(String[] args){
		try{
			int result=quotient(3,-1);
		}catch(MyException1 e){
			System.out.println(e.getMessage());
		}catch(ArithmeticException e){
			System.out.println("除数不能是0");
		}catch(Exception e){
			System.out.println("程序发生了其它异常");
		}
				
	}

}
