package net.fand.cheer.home170607;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file=new File("F:/test/666.txt");
		if(file.exists()){
			file.delete();
			System.out.println("�ļ���ɾ��");
		}else{
			try{
				file.createNewFile();
				System.out.println("�ļ��Ѵ���");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
