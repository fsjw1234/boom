package net.fand.cheer.home170607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu {
	public static void main(String[] args) {
		Map map=new HashMap<>();
		map.put("01", "李同学");
		map.put("02", "魏同学");
		map.put("03", "王同学");
		Set set=map.keySet();
		Iterator it=set.iterator();
		System.out.println("key集合中的元素：");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
