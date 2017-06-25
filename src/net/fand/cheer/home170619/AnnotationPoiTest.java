package net.fand.cheer.home170619;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.heinqi.yangtes.excel.ExcelField;
import com.heinqi.yangtes.excel.ExportExcel;

public class AnnotationPoiTest {
	public static void main(String[] args) throws Exception {
		List<Student> data=new ArrayList<Student>();
		{
			Student student = new Student();
			student.setName("zhangsan");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("170");
			student.setWeight("55");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			System.out.println(student);
			data.add(student);
		}
		{
			Student student = new Student();
			student.setName("lisi");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("170");
			student.setWeight("55");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			System.out.println(student);
			data.add(student);
		}
		
		{
			Student student = new Student();
			student.setName("wangwu");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("170");
			student.setWeight("55");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			System.out.println(student);
			data.add(student);
		}
		
		{
			Student student = new Student();
			student.setName("zhaoliu");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("169");
			student.setWeight("51");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			System.out.println(student);
			data.add(student);
		}
		
		{
			Student student = new Student();
			student.setName("qianqi");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("173");
			student.setWeight("67");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			
			System.out.println(student);
			data.add(student);
		}
		
		{
			Student student = new Student();
			student.setName("sunba");
			student.setSex("male");
			student.setBirthday(new Date());
			student.setHeight("166");
			student.setWeight("59");
			student.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			System.out.println(student);
			data.add(student);
		}
		
		new ExportExcel("Student info", Student.class).setDataList(data)
		.write(new FileOutputStream("E:/test/test/test.xlsx"));
		
	}

}

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9011510893650270266L;
	public static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	@ExcelField(title = "标识", sort = 10)
	private String id;
	@ExcelField(title = "姓名", sort = 20)
	private String name;
	@ExcelField(title = "性别", sort = 30)
	private String sex;
	private Date birthday;
	@ExcelField(title = "身高", sort = 40)
	private String height;
	@ExcelField(title = "体重", sort = 50)
	private String weight;

	public static DateFormat getDf() {
		return df;
	}

	public static void setDf(DateFormat df) {
		Student.df = df;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append(getId()).append("\t").append(getName()).append("\t")
				.append(getSex()).append("\t").append(df.format(getBirthday()))
				.append("\t").append(getHeight()).append("\t")
				.append(getWeight());
		return sb.toString();
	}

}