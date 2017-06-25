package net.fand.cheer.home170619;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ExternaizableTest {
	private final static DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
	public static void main(String[] args) throws Exception {
		User u=new User();
		u.setId(UUID.randomUUID().toString().replace("-", ""));
		u.setName("zhangsan");
		u.setBirthday(df.parse("1987-10-10"));
		u.setPassword("123456");
		System.out.println("Varrible [u] -> " + u);
		
		ObjectOutputStream out=null;
		FileOutputStream outFile=null;
		try{
			outFile=new FileOutputStream("E:"+File.separatorChar+"test/test/object.bin");
			out=new ObjectOutputStream(outFile);
			out.writeObject(u);
			out.flush();
		}finally{
			if(outFile!=null){
				outFile.close();
			}
			if(out!=null){
				out.close();
			}
		}
		ObjectInputStream in=null;
		FileInputStream inFile=null;
		try{
			inFile=new FileInputStream("E:"+File.separatorChar+"test/test/object.bin");
			in=new ObjectInputStream(inFile);
			Object _u=in.readObject();
			if(_u instanceof User){
				User __u=(User)_u;
				System.out.println("Varrible [__u] -> " + __u);
			}
			
		}finally{
			if(inFile!=null){
				outFile.close();
			}
			if(in!=null){
				out.close();
			}
		}
	}

}

class User implements java.io.Externalizable {
	private static final long serialVersionUID = 7998596684191773558L;
	private String id;
	private String name;
	private Date birthday;
	private String password;
	public User(){
		
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
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getName()).append("[\n").append("id=")
				.append(getId()).append("\n").append("name=").append(getName())
				.append("\n").append("birthday=").append(getBirthday())
				.append("\n").append("password=").append(getPassword())
				.append("\n").append("]");
		return sb.toString();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO �Զ����ɵķ������
		out.writeObject(getId());
		out.writeObject(getName());
		out.writeObject(getBirthday());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO �Զ����ɵķ������
		setId((String)in.readObject());
		setName((String)in.readObject());
		setBirthday((Date)in.readObject());
	}

}