package net.fand.cheer.home170624;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
	public static void main(String[] args) {
		Collection<String> list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("a");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String str=(String)it.next();
			System.out.println(str);
		}
	}
}
