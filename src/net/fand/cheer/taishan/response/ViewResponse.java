package net.fand.cheer.taishan.response;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.entity.Student;

public class ViewResponse implements Response {

	public void render(Request request) {
		// TODO �Զ����ɵķ������
		System.out.println("��ǰ�ܹ���" + TaiShan.data.size() + "��ѧ����¼");
		System.out
				.println("id\t\t\tname\t\tsex\t\tbirthday\t\theight\t\tweight");
		System.out
				.println("------------------------------------------------------------------------------------");
	for(int i=0;i<TaiShan.data.size();i++){
		Student student=TaiShan.data.get(i);
		System.out.println(student);
		
	}
	
	
	}

}
