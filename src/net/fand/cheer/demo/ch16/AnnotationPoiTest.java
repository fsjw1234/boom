package net.fand.cheer.demo.ch16;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.heinqi.yangtes.excel.ExportExcel;

public class AnnotationPoiTest {
	public static void main(String[] args) throws Exception {
		List<Student> data=new ArrayList<Student>();
		Student student=new Student();
		student.setName("zhangsan");
		student.setSex("man");
		student.setAge(20);
		
		System.out.println(student);
		data.add(student);
	
	new ExportExcel("student info",Student.class)
	.setDataList(data).write(new FileOutputStream("F:/test/2.xls"));
	}
}

class Student{
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
