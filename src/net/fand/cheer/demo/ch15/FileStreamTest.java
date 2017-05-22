package net.fand.cheer.demo.ch15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStreamTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File f=new File("F:/test/a.jpg");
		FileOutputStream out=new FileOutputStream(f);
		String content="adasdasdasda";
		out.write(content.getBytes());
		out.flush();
		out.close();
		
		FileInputStream in=new FileInputStream(f);
		byte[] _content=new byte[in.available()];
		in.read(_content);
		String readContent=new String(_content);
		System.out.println(readContent);
	}
}
