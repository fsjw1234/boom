package net.fand.cheer.home170607;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UpdateStu {
	public static void main(String[] args) {
		Map map=new HashMap<>();
		map.put("01", "��ͬѧ");
		map.put("02", "κͬѧ");
		map.put("03", "��ͬѧ");
		Set set=map.keySet();
		Iterator it=set.iterator();
		System.out.println("key�����е�Ԫ�أ�");
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
