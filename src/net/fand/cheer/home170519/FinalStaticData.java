package net.fand.cheer.home170519;
import static java.lang.System.out;

import java.util.Random;

public class FinalStaticData {
	private static Random rand=new Random();
	private final int a1=rand.nextInt(10);
	private static final int a2=rand.nextInt(10);
	public static void main(String[] args){
		FinalStaticData fdata=new FinalStaticData();
		out.println("����ʵ�����������a1��ֵ�� "+fdata.a1);
		out.println("����ʵ�����������a2��ֵ�� "+fdata.a2);
		FinalStaticData fdata2=new FinalStaticData();
		out.println("����ʵ�����������a1��ֵ�� "+fdata2.a1);
		out.println("����ʵ�����������a2��ֵ�� "+fdata2.a2);

	}
}
