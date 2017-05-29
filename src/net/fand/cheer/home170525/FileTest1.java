package net.fand.cheer.home170525;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args){
		File file=new File("F:/test/word.txt");
		if(file.exists()){
			String name=file.getName();
			long length=file.length();
			boolean hidden=file.isHidden();
			System.out.println("文件名称： "+name);
			System.out.println("文件长度是： "+length);
			System.out.println("该文件是隐藏文件吗？ "+hidden);
		}else{
			System.out.println("该文件不存在");
		}
	}
}
