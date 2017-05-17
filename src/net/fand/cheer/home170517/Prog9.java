package net.fand.cheer.home170517;

public class Prog9 {
	public static void main(String[] args){
		int n=100;
		compNumber(n);
	}
	
	private static void compNumber(int n){
		int count=0;
		System.out.println(n+"以内的完数：");
		for(int i=1;i<n+1;i++){
			int sum=0;
			//for(int j=1;j<i/2+1;j++){
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum=sum+j;
					if(sum==i){
						System.out.println(i+" ");
						//if((count++)%5==0)
							//System.out.println();
					}
				}
			}
		}
	}

}
