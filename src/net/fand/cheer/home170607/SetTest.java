package net.fand.cheer.home170607;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		System.out.println(list.size());
		
		Set set=new HashSet();
		set.add(0);
		set.add(0);
		set.add(0);
		set.add(1);
		System.out.println(set.size());
		
	}

}
