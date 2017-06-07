package net.fand.cheer.taishan.request;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;

public class ViewRequest implements Request {
	public boolean input() {
		if (TaiShan.data.size() > 0) {
			return true;
		} else {
			System.out.println("当前没有学生记录，请先添加学生信息");
			return false;
		}
	}
}
