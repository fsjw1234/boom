package net.fand.cheer.taishan.response;

import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;

public class ExitResponse implements Response{

	@Override
	public void render(Request request) {
		// TODO 自动生成的方法存根
		System.out.println("谢谢使用！");
		System.exit(0);
	}

}
