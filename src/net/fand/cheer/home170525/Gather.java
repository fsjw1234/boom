package net.fand.cheer.home170525;

import java.util.ArrayList;
import java.util.List;

public class Gather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		int i=(int)(Math.random()*list.size());
		System.out.println("随机获取数组中的元素： "+list.get(i));
		list.remove(2);
		System.out.println("将索引是2的元素从数组移除后，数组的元素是：");
		for(int j=0;j<list.size();j++){
			System.out.println(list.get(j));
		}
	}

}
