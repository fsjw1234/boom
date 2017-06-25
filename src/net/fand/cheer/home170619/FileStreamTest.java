package net.fand.cheer.home170619;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
		File f = new File("E:" + File.separatorChar + "test/test/abc");
		FileOutputStream out = null;
		FileInputStream in = null;
		try {
			out = new FileOutputStream(f);
			String content = "welome   ‰»Î ‰≥ˆ";
			out.write(content.getBytes());
			out.flush();
			out.close();

			in = new FileInputStream(f);
			byte[] _content = new byte[in.available()];
			in.read(_content);
			String readContent = new String(_content);
			System.out.println(readContent);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {

			}

		}

	}

}
