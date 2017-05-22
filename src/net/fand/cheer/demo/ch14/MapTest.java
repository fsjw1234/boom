package net.fand.cheer.demo.ch14;

import java.util.HashMap;

import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country China = new Country();
		China.setTitle("china");
		China.setName("hello");
		China.setCode("code");

		Map map = new HashMap();
		// map.put(China.getCode()),China);
		China.setTitle("1");	
		China.setName("2");
		China.setCode("3");
		Map g2 = new HashMap();
		g2.put(China.getCode(), China);
		g2.put(China.getCode(), China);

		System.out.println(map.get("cn"));
	}

}

class Country {
	private String title;
	private String code;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
