package net.fand.cheer.home170516;
import static java.lang.System.out;

class Demo1{
	public int method(int[] arr,int index){
		if(index>=arr.length){
			throw new  ArrayIndexOutOfBoundsException("����ĽǱ�Խ�磺"+index);
		}
		if(index<0){
			throw new ArrayIndexOutOfBoundsException("����Ϊ����"+index);
		}
		return arr[index];
	}
}

public class ExceptionDemo2 {
	public static void main(String[] args){
		int[] arr=new int[3];
		Demo1 d=new Demo1();
		int num=d.method(arr, -30);
		out.println("num="+num);
		out.print("over");
	}

}
