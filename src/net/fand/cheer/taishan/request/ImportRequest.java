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
		// TODO �Զ����ɵķ������
		System.out.println("�����뱣���·����");
		storeFilePath=TaiShan.scanner.nextLine();
		return false;
	}
	

}
