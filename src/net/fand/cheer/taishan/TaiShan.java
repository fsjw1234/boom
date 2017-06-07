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
import net.fand.cheer.taishan.request.ViewRequest;
import net.fand.cheer.taishan.response.AddResponse;
import net.fand.cheer.taishan.response.ViewResponse;

public class TaiShan {
	public static List<Student> data=new ArrayList<Student>();
	public final static Map<String,Processor> commandMap=new HashMap<String,Processor>();
	public final static String DEFAULT_COMMAND="M";
	public final static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		init();
		Processor processor=new Processor(new Request(){
			public boolean input() {
				return true;
			}},new Response(){
				public void render(Request request) {
					System.out.println("�����������������������");
					System.out.println("V - �鿴ѧ����Ϣ");
					System.out.println("A - ����һ��ѧ����Ϣ");
					//System.out.println("O - ����ѧ����Ϣ");
					//System.out.println("I - ����ѧ����Ϣ");
					System.out.println("E - �˳�ϵͳ");
					
					while(scanner.hasNextLine()){
						String command=scanner.nextLine();
						Processor p=commandMap.get(command.toUpperCase());
						if(p!=null){
							p.handle();
						}else{
							System.out.println("������ڣ��˻ص����˵�");
							Processor m=commandMap.get(DEFAULT_COMMAND);
							m.handle();
							return;
						}
					}
				}});
		commandMap.put(DEFAULT_COMMAND, processor);
		System.out.println("------------------");
		System.out.println("|��ӭ����̩ɽϵͳ��  |");
		System.out.println("------------------");
		processor.handle();
		
		
		
		
		
	}
	private static void init() {
		Processor v=new Processor(new ViewRequest(),new ViewResponse());
		commandMap.put("V",v);
		Processor a=new Processor(new AddRequest(),new AddResponse());
		commandMap.put("A",a);
		
		}
	}
