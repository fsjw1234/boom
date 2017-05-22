package net.fand.cheer.demo.ch15;

import java.io.File;
import java.io.FileFilter;

import java.io.FilenameFilter;

import static java.lang.System.out;

public class FileBrowserTest {
	public static void main(String[] args) {
		File f = new File("F:/test");
		if (f.isDirectory()) {
			File[] children = f.listFiles(new FileFilter(){

				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					return pathname.getName().endsWith(".jpg");
				}});
			
			System.out.println("result");
			for (int i = 0; i < children.length; i++) {
				File child = children[i];
				out.println(child.getAbsolutePath());
			}
		}
	}
}
