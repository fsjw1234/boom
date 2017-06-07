package net.fand.cheer.demo.ch16;

import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.util.Date;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor<?>[] constructors=User.class.getConstructors();
		for(int i=0;i<constructors.length;i++){
			Constructor<?> constructor=constructors[i];
			if(constructor.getGenericParameterTypes()==null||constructor.getParameterTypes().length==0){
				System.out.println("构造方法没有参数");
				
				/*Object user=constructor.newInstance();
				System.out.println(user);*/
			}else{
				System.out.println("构造方法有"+constructor.getParameterCount()+"参数");
			}
		}
	}
}

class User implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private Date Birthday;
	
	public User()throws RuntimeException,Exception,ParseException{
		
	}
	public User(String name){
		this.name=name;
	}
	public User(String name,Date Birthday){
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