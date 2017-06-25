package net.fand.cheer.taishan.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	public static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	private String id;
	private String name;
	private String sex;
	private Date birthday;
	private String height;
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
		StringBuilder sb = new StringBuilder();
		sb.append(getId()).append("\t").append(getName()).append("\t")
				.append(getSex()).append("\t").append(df.format(getBirthday()))
				.append("\t").append(getHeight()).append("\t")
				.append(getWeight());
		return sb.toString();

	}

}
