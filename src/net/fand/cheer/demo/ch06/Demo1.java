package net.fand.cheer.demo.ch06;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;

public class Demo1 {
	public static void main(String[] args) throws Exception{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.getClass().getName());
		
		DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.getClass().getName());
		
		Format f=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f.getClass().getName());
		
		Object o=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(o.getClass().getName());
		
		if(sdf.getClass().equals(SimpleDateFormat.class)){
			System.out.println("getClass:sdf is SimpleDateFormat.class");
		}
		
		if(sdf.getClass().equals(DateFormat.class)){
			System.out.println("getClass:sdf is Dateformat.class");
		}
		
		if(sdf.getClass().equals(Format.class)){
			System.out.println("getClass:sdf is Format.class");
		}
		
		if(sdf.getClass().equals(Object.class)){
			System.out.println("getClass:sdf is Object.class");
		}
		
		if(sdf instanceof SimpleDateFormat){
			System.out.println("instanceof:sdf is SimpleDateFormat.class");
		}
		
		if(df instanceof DateFormat){
			System.out.println("instanceof:df is DateFormat.class");
		}
		
		if(f instanceof Format){
			System.out.println("instanceof:f is Format.class");
		}
		
		if(o instanceof Object){
			System.out.println("instanceof:o is Object.class");
		}
	}
}
