package net.fand.cheer.demo.ch04;

public class ArrayToolDemo {
	public static void main(String[] args){
	int[] arr={3,54,32,21,67};

	int max=ArrayTool.getMax(arr);
	System.out.println("max="+max);
	
	int index=ArrayTool.getIndex(arr,54);
	System.out.println("index="+index);
	}
}
