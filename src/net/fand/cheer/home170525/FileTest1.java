package net.fand.cheer.home170525;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args){
		File file=new File("F:/test/word.txt");
		if(file.exists()){
			String name=file.getName();
			long length=file.length();
			boolean hidden=file.isHidden();
			System.out.println("�ļ����ƣ� "+name);
			System.out.println("�ļ������ǣ� "+length);
			System.out.println("���ļ��������ļ��� "+hidden);
		}else{
			System.out.println("���ļ�������");
		}
	}
}
