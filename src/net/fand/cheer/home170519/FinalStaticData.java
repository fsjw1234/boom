package net.fand.cheer.home170519;
import static java.lang.System.out;

import java.util.Random;

public class FinalStaticData {
	private static Random rand=new Random();
	private final int a1=rand.nextInt(10);
	private static final int a2=rand.nextInt(10);
	public static void main(String[] args){
		FinalStaticData fdata=new FinalStaticData();
		out.println("重新实例化对象调用a1的值： "+fdata.a1);
		out.println("重新实例化对象调用a2的值： "+fdata.a2);
		FinalStaticData fdata2=new FinalStaticData();
		out.println("重新实例化对象调用a1的值： "+fdata2.a1);
		out.println("重新实例化对象调用a2的值： "+fdata2.a2);

	}
}
