package net.fand.cheer.taishan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import net.fand.cheer.taishan.define.Processor;
import net.fand.cheer.taishan.define.Request;
import net.fand.cheer.taishan.define.Response;
import net.fand.cheer.taishan.entity.Student;
import net.fand.cheer.taishan.request.AddRequest;
import net.fand.cheer.taishan.request.ExitRequest;
import net.fand.cheer.taishan.request.ExportRequest;
import net.fand.cheer.taishan.request.ImportRequest;
import net.fand.cheer.taishan.request.ViewRequest;
import net.fand.cheer.taishan.response.AddResponse;
import net.fand.cheer.taishan.response.ExitResponse;
import net.fand.cheer.taishan.response.ExportResponse;
import net.fand.cheer.taishan.response.ImportResponse;
import net.fand.cheer.taishan.response.ViewResponse;

public class TaiShan {
	public static List<Student> data = new ArrayList<Student>();
	public final static Map<String, Processor> commandMap = new HashMap<String, Processor>();
	public final static String DEFAULT_COMMAND = "M";
	public final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		init();
		Processor processor = new Processor(new Request() {

			@Override
			public boolean input() {
				// TODO 自动生成的方法存根
				return true;
			}

		}, new Response() {
			public void render(Request request) {
				System.out.println("在这里你可以输入以下命令");
				System.out.println("V - 查看学生信息");
				System.out.println("A - 增加一个学生信息");
				System.out.println("E - 导出学生信息");
				System.out.println("I - 导入学生信息");
				System.out.println("X - 退出系统");
				while (scanner.hasNextLine()) {
					String command = scanner.nextLine();
					Processor _p = commandMap.get(command.toUpperCase());
					if (_p != null) {
						_p.handle();
					} else {
						System.out.println("命令不存在！退到主菜单");
						Processor _m = commandMap.get(DEFAULT_COMMAND);
						_m.handle();
						return;
					}
				}
			}
		});
		commandMap.put(DEFAULT_COMMAND, processor);
		System.out.println("------------------");
		System.out.println("|欢迎来到泰山系统！  |");
		System.out.println("------------------");
		processor.handle();
	}

	public static void init() {
		Processor v = new Processor(new ViewRequest(), new ViewResponse());
		commandMap.put("V", v);
		Processor a = new Processor(new AddRequest(), new AddResponse());
		commandMap.put("A", a);
		Processor e = new Processor(new ExportRequest(), new ExportResponse());
		commandMap.put("E", e);
		Processor i = new Processor(new ImportRequest(), new ImportResponse());
		commandMap.put("I", i);
		Processor x = new Processor(new ExitRequest(), new ExitResponse());
		commandMap.put("X", x);

	}

}
