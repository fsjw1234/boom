package net.fand.cheer.home170516;
import static java.lang.System.out;;

class Person extends Object{
	private int age;
	Person(int age){
		this.age=age;
	}
	public boolean equals(Object obj){
		if(!(obj instanceof Person)){
			//return false;
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ");
		}
		
		Person p=(Person)obj;
		return this.age==p.age;
	}
}
class Demo{
	
}

public class ObjectDemo {
	public static void main(String[] args){
		Person p1=new Person(20);
		Person p2=new Person(20);
		Demo d=new Demo();
		Person p3=p1;

		out.println(p1.equals(p2));
	}
}
