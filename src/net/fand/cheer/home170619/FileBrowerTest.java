package net.fand.cheer.home170619;

import java.io.File;
import java.io.FileFilter;

public class FileBrowerTest {
	public static void main(String[] args) {
		File f = new File("E:" + File.separatorChar + "test/test/1");
		if (f.isDirectory()) {
			File[] children = f.listFiles(new FileFilter() {

				@Override
				public boolean accept(File pathname) {
					// TODO 自动生成的方法存根
					System.out.println(pathname.getName());
					return pathname.getName().endsWith(".exe");
				}
			});

			System.out.println("Result as Below>>>>>>>");
			for (int i = 0; i < children.length; i++) {
				File child = children[i];
				System.out.println(child.getAbsolutePath());
			}
		}

	}

}