package net.fand.cheer.home170619;

import java.util.Date;

public class ClazzTest {
	public static void main(String[] args) {
		Package _package=ClazzTest.class.getPackage();
		System.out.println(_package.getName());
		
		Class<?> clazz=ClazzTest.class;
		System.out.println(clazz.getName());
		
		System.out.println(clazz.getSuperclass().getName());
		
		Class personClass=Person.class;
		Class[] interfaces=personClass.getInterfaces();
		System.out.println(interfaces[0].getName());
		System.out.println(interfaces[1].getName());
		
	}

}

class Person implements java.io.Serializable, java.lang.Cloneable{
	private String id;
	private String name;
	private Date birthday;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getName()).append("[\n").append("id=")
				.append(getId()).append("\n").append("name=").append(getName())
				.append("\n").append("birthday=").append(getBirthday())
				.append("\n").append("]");
		return sb.toString();

	}

}