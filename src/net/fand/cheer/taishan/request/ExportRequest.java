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
		// TODO �Զ����ɵķ������
		System.out.print("�����뱣���ļ���·��:");
		storeFilePath=TaiShan.scanner.nextLine();
		return true;
	}

}
