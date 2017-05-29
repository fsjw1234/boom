package net.fand.cheer.home170525;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
	private void zip(String zipFileName, File inputFile) throws Exception {
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
		zip(out, inputFile, "");
		System.out.println("—πÀı÷–......");
		out.close();
	}

	private void zip(ZipOutputStream out, File f, String base) throws Exception {
		// TODO Auto-generated method stub
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			if (base.length() != 0) {
				out.putNextEntry(new ZipEntry(base + "/"));
			}
			for (int i = 0; i < fl.length; i++) {
				zip(out, fl[i], base + fl[i]);
			}
		} else {
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			int b;
			System.out.println(base);
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
		}
	}

	public static void main(String[] args) {
		MyZip book = new MyZip();
		try {
			book.zip("F:/test/word.zip", new File("F:/test/word.txt"));
			System.out.println("—πÀıÕÍ≥…");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
