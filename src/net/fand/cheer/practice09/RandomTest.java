package net.fand.cheer.practice09;

public class RandomTest {
	public static double Num(double num1,double num2){
		double sum=0;
		int count=0;
		while(true){
			int tmp=(int)num1+(int)(Math.random()*(num2-num1));
			if(tmp!=0 && tmp%2==0){
				System.out.println("打印2到32之间的偶数（不包括32）"+tmp);
				sum+=tmp;
				count++;
			}
			if(count==6){
				break;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println("和为："+Num(2,32));
	}

}
