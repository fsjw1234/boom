package net.fand.cheer.taishan.request;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.UUID;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.entity.Student;

public class AddRequest implements Request{
	private Student fill;
	
	public Student getFill() {
		return fill;
	}


	public boolean input() {
		fill=new Student();
		String[] fields=new String[]{"����","�Ա�","��������","���","����"};
		String [] reflectFields={"name","sex","birthday","height","weight"};
		
		for(int i=0;i<fields.length;i++){
			System.out.println("������ѧ����"+fields[i]+":");
			String value=TaiShan.scanner.nextLine();
			try{
				Field field=Student.class.getDeclaredField(reflectFields[i]);
				field.setAccessible(true);
				if("birthday".equals(reflectFields[i])){
					try{
						field.set(fill,Student.df.parse(value));
					}catch(ParseException e){
						e.printStackTrace();
					}
				}else{
					field.set(fill, value);
				}
				field.setAccessible(false);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		fill.setId(UUID.randomUUID().toString());
		return true;
	}
}
