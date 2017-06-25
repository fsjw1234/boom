package net.fand.cheer.taishan.request;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;

public class ExportRequest implements Request{

	private String storeFilePath;
	
	public String getStoreFilePath(){
		return storeFilePath;
		
	}
	@Override
	public boolean input() {
		// TODO 自动生成的方法存根
		System.out.print("请输入保存文件的路径:");
		storeFilePath=TaiShan.scanner.nextLine();
		return true;
	}

}
