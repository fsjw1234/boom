package net.fand.cheer.home170517;
import static java.lang.System.out;

class Demo{
	public int show(int index){
		if(index<0)
			throw new ArrayIndexOutOfBoundsException("Ô½½ç");
		int[] arr=new int[3];
		return arr[index];
	}
}

public class ExceptionDemo1 {
	public static void main(String[] args){
		Demo d=new Demo();
		try{
			int num=d.show(-1);
			out.println("num="+num);
		}
		catch(ArrayIndexOutOfBoundsException e){
			out.println(e.toString());
			
			//return;
			System.exit(0);
		}
		finally {
			out.println("finally");
		}
		out.println("over");
	}
}
