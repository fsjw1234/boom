package net.fand.cheer.taishan.request;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;

public class ImportRequest implements Request{

	private String storeFilePath;
	
	public String getStoreFilePath(){
		return storeFilePath;
	}
	@Override
	public boolean input() {
		// TODO 自动生成的方法存根
		System.out.println("请输入保存的路径：");
		storeFilePath=TaiShan.scanner.nextLine();
		return false;
	}
	

}
