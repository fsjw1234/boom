package net.fand.cheer.home170525;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest2 {

	public static void main(String[] args) {
		File file=new File("F:/test/word.txt");
		try{
			FileOutputStream out=new FileOutputStream(file);
			byte buy[]="����һֻСë¯���Ҵ���Ҳ����".getBytes();
			out.write(buy);
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileInputStream in=new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("�ļ��е���Ϣ�ǣ� "+new String(byt,0,len));
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
