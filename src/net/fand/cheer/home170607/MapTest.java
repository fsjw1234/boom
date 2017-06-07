package net.fand.cheer.home170607;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Country china=new Country();
		china.setTitle("new china");
		china.setName("ÐÂÖÐ¹ú");
		china.setCode("cn");
		
		Country unionStatus=new Country();
		unionStatus.setTitle("Union Status");
		unionStatus.setName("Amerina");
		unionStatus.setCode("us");
		
		Map g2=new HashMap();
		g2.put(china.getCode(), china);
		g2.put(unionStatus.getCode(), unionStatus);
		
		System.out.println(g2.get("cn"));
		System.out.println(g2.get("us"));
		
		Country[] array=new Country[100];
		System.out.println(china.getCode().hashCode());
		System.out.println(unionStatus.getCode().hashCode());
	}

}

class Country{
	private String title;
	private String name;
	private String code;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(getTitle()).append(",")
		.append(getName()).append(",")
		.append(getCode());
		return sb.toString();
	}
}