package net.fand.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ObjectStreamTest {
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		System.out.println(UUID.randomUUID().toString());
		p.setId(UUID.randomUUID().toString().replaceAll("-", ","));
		p.setName("张三");
		p.setBirthday(df.parse("1987-10-10"));

		System.out.println(p);

		// File.separator文件路径最好使用
		// ObjectOutputStream out=new ObjectOutputStream(new
		// FileOutputStream("F:/test"));
		ObjectOutputStream out = null;
		FileOutputStream outFile = null;

		try {
			outFile = new FileOutputStream("F:" + File.separator + "/test/2.txt");
			out = new ObjectOutputStream(outFile);
			out.writeObject(p);
			out.flush();
		} finally {
			if (outFile != null) {
				outFile.close();
			}
			if (out != null) {
				out.close();
			}
		}

		ObjectInputStream in = null;
		FileInputStream inFile = null;

		try {
			inFile = new FileInputStream("F:" + File.separator + "/test/2.txt");
			in = new ObjectInputStream(inFile);
			Object _p = in.readObject();
			if (_p instanceof Person) {
				Person __p = (Person) _p;
				System.out.println(__p);

			}

		} finally {
			if (outFile != null) {
				outFile.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}

class Person implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Date Birthday;
	private String password;
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