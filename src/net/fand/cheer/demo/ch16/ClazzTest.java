package net.fand.cheer.demo.ch16;

import java.util.Date;

public class ClazzTest {
	public static void main(String[] args) {
		Package _packge=ClazzTest.class.getPackage();
		System.out.println(_packge.getName());
		
		Class<?> clazz=ClazzTest.class;
		System.out.println(clazz.getName());
		
		System.out.println(clazz.getSuperclass().getName());
		
		Class<?> personClass=Person.class;
		Class<?>[] interfaces=personClass.getInterfaces();
		System.out.println(interfaces[0].getName());
		System.out.println(interfaces[1].getName());
		
	}
}

class Person implements java.io.Serializable ,java.lang.Cloneable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Date Birthday;
	private String password;
	
	public  Person(){
		
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

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {

		Birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append(getClass().getName()).append("[\n").append("id=").append(getId()).append("name=").append(getName())
				.append("birthday=").append(getBirthday()).append("password=").append(getPassword()).append("\n]");
		return sb.toString();
	}
}