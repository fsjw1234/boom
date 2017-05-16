//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。

//程序分析：关键是计算出每一项的值

package net.fand.cheer.home170516;
import static java.lang.System.out;

import java.util.Scanner;
public class Prog8 {
	public static void main(String[] args){
		out.println("求s=a+aa+aaa+aaaa+...的值：");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		out.println(expressed(a,n));
	}
	
	private static String expressed(int a,int n){
		StringBuffer sb=new StringBuffer();
		StringBuffer subSB=new StringBuffer();
		for(int i=1;i<n+1;i++){
			subSB=subSB.append(a);
			sb=sb.append(subSB);
			if(i<n)
				sb=sb.append("+");
			}
			sb.append("=");
			return sb.toString();
		}
		/*long add(int a,int n){
			long sum=0;
			long subSUM=0;
			for(int i=1;i<n+1;i++){
				subSUM=subSUM*10+a;
				sum=sum+subSUM;
			}
			return sum;
		}*/
	}

