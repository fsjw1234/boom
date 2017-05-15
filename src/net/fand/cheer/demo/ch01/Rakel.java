package net.fand.cheer.demo.ch01;

import java.util.Arrays;

public class Rakel {
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,4,6};
		Arrays.sort(arr);
		int index=Arrays.binarySearch(arr, 0,2,2);
		System.out.println(index);
		
	}

}
