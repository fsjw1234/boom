package net.fand.cheer.home170516;
import static java.lang.System.out;
class Demo2{
	public int method(int[] arr,int index)throws Exception{
		if(index<0)
			throw new Exception("角标变成负数");
			return arr[index];
	}
}

public class ExceptionDemo4 {
	public static void main(String[] args){
		int[] arr=new int[3];
		Demo2 d=new Demo2();
		try{
			int num=d.method(arr,-30);
			out.println("num="+num);
		}
		catch(Exception e){
			out.println("负数角标异常");
		}
		out.println("over");
	}

}
