package net.fand.cheer.taishan.response;

import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;

public class ExitResponse implements Response{

	@Override
	public void render(Request request) {
		// TODO �Զ����ɵķ������
		System.out.println("ллʹ�ã�");
		System.exit(0);
	}

}
