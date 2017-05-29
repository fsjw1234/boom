package net.fand.cheer.home170525;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Muster {
	public static void main(String[] args){
			Collection<String> list=new ArrayList<>();
			list.add("a");
			list.add("b");
			list.add("c");
			list.add("d");
			Iterator<String> it=list.iterator();
			while(it.hasNext()){
				String str=(String)it.next();
				System.out.print(str+",");
			}
			
	}

}
