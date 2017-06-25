package net.fand.cheer.taishan.response;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.entity.Student;

public class ViewResponse implements Response {

	public void render(Request request) {
		// TODO 自动生成的方法存根
		System.out.println("当前总共有" + TaiShan.data.size() + "条学生记录");
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
