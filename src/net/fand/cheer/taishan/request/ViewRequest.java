package net.fand.cheer.taishan.request;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;

public class ViewRequest implements Request{

	@Override
	public boolean input() {
		// TODO �Զ����ɵķ������
		if(TaiShan.data.size()>0){
			return true;
		}else{
			System.out.println("��ǰû��ѧ����¼����������ѧ����Ϣ��");
		return false;
		}
	}

	
}
