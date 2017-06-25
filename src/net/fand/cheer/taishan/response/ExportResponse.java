package net.fand.cheer.taishan.response;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.request.ExportRequest;

public class ExportResponse implements Response {

	@Override
	public void render(Request request) {
		// TODO 自动生成的方法存根
		ExportRequest _request = (ExportRequest) request;
		String storeFilePath = _request.getStoreFilePath();
		ObjectOutputStream objectOut = null;
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(storeFilePath);
			objectOut = new ObjectOutputStream(fout);
			objectOut.writeObject(TaiShan.data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (objectOut != null) {
					objectOut.close();
				}
				if (fout != null) {
					fout.close();
				}
			} catch (IOException e) {

			}
		}
		System.out.println("数据保存成功！");
		TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
	}
}
