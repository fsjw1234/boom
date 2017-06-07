package net.fand.cheer.home170607;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("F:/test/666.txt");
		if(file.exists()){
			String name=file.getName();
			long length=file.length();
			boolean hidden=file.isHidden();
			System.out.println(name);
			System.out.println(length);
			System.out.println(hidden);
		}else{
			System.out.println("该文件不存在");
		}
	}
}
