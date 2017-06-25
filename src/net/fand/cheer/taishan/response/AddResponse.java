package net.fand.cheer.taishan.response;

import net.fand.cheer.taishan.TaiShan;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.request.AddRequest;

public class AddResponse implements Response {

	@Override
	public void render(Request request) {
		// TODO 自动生成的方法存根
		AddRequest addRequest=(AddRequest)request;
		TaiShan.data.add(addRequest.getFill());
		System.out.println("学生信息增加成功！");
		TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
	}

}
