package net.fand.cheer.taishan.response;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.entity.Student;
import net.fand.cheer.taishan.request.ImportRequest;

public class ImportResponse implements Response {

	@Override
	public void render(Request request) {
		// TODO 自动生成的方法存根
		ImportRequest _request = (ImportRequest) request;
		String storeFilePath = _request.getStoreFilePath();

		ObjectInputStream oin = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(storeFilePath);
			oin = new ObjectInputStream(fin);
			Object content = oin.readObject();
			if (content instanceof List) {
				List<?> fileData = (List<?>) content;
				for (int i = 0; i < fileData.size(); i++) {
					Object item = fileData.get(i);
					if (item instanceof Student) {
						Student student = (Student) item;
						TaiShan.data.add(student);
					}

				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oin != null) {
					oin.close();
				}
				if (fin != null) {
					fin.close();
				}
			} catch (IOException e) {

			}
		}
		System.out.println("数据导入成功！");
		TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
	}

}
