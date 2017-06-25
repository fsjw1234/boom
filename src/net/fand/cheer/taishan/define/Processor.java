package net.fand.cheer.taishan.define;

import net.fand.cheer.taishan.TaiShan;

public class Processor {
	private Request request;
	private Response response;

	public Processor(Request request, Response response) {
		this.request = request;
		this.response = response;

	}

	public void handle() {
		if (request.input()) {
			response.render(request);

		} else {
			TaiShan.commandMap.get(TaiShan.DEFAULT_COMMAND).handle();
		}

	}

}
