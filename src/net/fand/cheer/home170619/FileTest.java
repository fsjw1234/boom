package net.fand.cheer.home170619;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File f=new File("E:/test/software/PuTTY_0.67.0.0.exe");
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("is folder");
			}else{
				System.out.println("is file");
				System.out.println("file size"+f.length());
			}
		}else{
			System.out.println("not exits");
			boolean created=f.mkdirs();
			System.out.println("File is create"+created);
		}
	}
}
