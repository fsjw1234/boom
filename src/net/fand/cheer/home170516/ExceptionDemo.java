package net.fand.cheer.home170516;
import static java.lang.System.out;

public class ExceptionDemo {
	public static void main(String[] args){
		int[] arr=new int[3];
		arr=null;
		out.println(arr[3]);
		sleep(-5);
	}
	public static void sleep(int time){
		if(time<0){
		}
		if(time>10000){
		}
		out.println("Œ“ÀØ£∫"+time);
	}
}
