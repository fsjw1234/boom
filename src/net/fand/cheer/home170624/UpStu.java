package net.fand.cheer.home170624;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpStu {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("01","��ͬѧ");
		map.put("02","κͬѧ");
		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		System.out.println("key�����е�Ԫ�أ� ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collection<String> coll=map.values();
		it=coll.iterator();
		System.out.println("values�����е�Ԫ�أ� ");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
