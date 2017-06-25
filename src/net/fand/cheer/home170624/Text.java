package net.fand.cheer.home170624;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Text {
	public static void main(String[] args) {
		List<Text> list=new LinkedList<>();
		for(int i=1;i<20;i++){
			list.add(new Text());
			
		}
		list.remove(list.get(10));
		Iterator<Text> a=list.iterator();
		while(a.hasNext()){
			Text str=(Text)a.next();
			
			System.out.println(str);
		}
		
		System.out.println("ok");
	}

}
