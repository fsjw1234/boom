package net.fand.cheer.demo.ch16;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.Date;

public class FieldTest {
	public static void main(String[] args) throws Exception {
		Operator ope=new Operator();
		System.out.println(ope);
		Field field=Operator.class.getDeclaredField("name");
		System.out.println("name is public?" +field.getModifiers());
		field.setAccessible(true);
		field.set(ope, "lisi");
		field.setAccessible(false);
	}

}

class Operator implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Date Birthday;
	
	public Operator()throws RuntimeException,Exception,ParseException{
		
	}
	public Operator(String name){
		this.name=name;
	}
	public Operator(String name,Date Birthday){
		this.name=name;
		this.Birthday=Birthday;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {

		Birthday = birthday;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append(getClass().getName()).append("[\n").append("id=").append(getId()).append("name=").append(getName())
				.append("birthday=").append(getBirthday()).append("\n]");
		return sb.toString();
	}
}