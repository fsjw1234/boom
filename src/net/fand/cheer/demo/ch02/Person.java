package net.fand.cheer.demo.ch02;

public class Person {
	public String name;
	public String sex;
	public int age;
	public void sleep(){
		System.out.println("��ƣ���ʱ��ϲ��˯��");
	}
	public void eat(){
		System.out.println("�˼�����ʱ��ϲ���Է�");
	}
	public static void main(String[] args){
		Person p=new Person();
		p.eat();
		p.sleep();
	}

}
