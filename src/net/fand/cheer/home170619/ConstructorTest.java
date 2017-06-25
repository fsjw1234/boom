package net.fand.cheer.home170619;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class ConstructorTest {
	public static void main(String[] args) throws Exception{
		Constructor[] constructs=Ren.class.getConstructors();
		for(int i=0;i<constructs.length;i++){
			Constructor constructor=constructs[i];
			if(constructor.getParameterTypes()==null ||
					constructor.getParameterTypes().length==0){
				System.out.println("no constructors");
				
				Object user=constructor.newInstance();
				System.out.println(user);
				System.out.println(user.getClass().getName());
				
				
			}else{
				System.out.
				println("This Constructor Method have "+constructor.getParameterTypes().length +" parameter(s)");
				
				if(constructor.getParameterTypes().length > 1){
					Object user =  constructor.newInstance("zhangsan",new Date());
					System.out.println(user);
				}else{
					Object user =  constructor.newInstance("zhangsan");
					System.out.println(user);
				}	
				
			}
			
		}
		
		
		
		
		
	}

}

class Ren {
	private String id;
	private String name;
	private Date birthday;

	public Ren() {
	}

	public Ren(String name) {
		this.name = name;
	}

	public Ren(String name, Date birthday) {
		this.name = name;
		this.birthday = birthday;
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

	public String toString() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append(getClass().getName()).append("[\n").append("id=")
				.append(getId()).append("\n").append("name=").append(getName())
				.append("\n").append("birthday=").append(getBirthday())
				.append("\n").append("]");
		return sb.toString();
	}

}