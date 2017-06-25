package net.fand.cheer.taishan.request;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;

public class ViewRequest implements Request{

	@Override
	public boolean input() {
		// TODO 自动生成的方法存根
		if(TaiShan.data.size()>0){
			return true;
		}else{
			System.out.println("当前没有学生记录，请先增加学生信息！");
		return false;
		}
	}

	
}
