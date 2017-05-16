package net.fand.cheer.home170516;
import static java.lang.System.out;
class Father{
	Father(){
		
	}
	void show(){
		out.println("haha");
	}
}

class Son extends Father{
	int num=9;
	{
		out.println("constructor code..."+num);
		num=10;
	}
	Son(){
		out.println("zi constructor..."+num);
	}
	void show(){
		out.println("show..."+num);
	}
}

public class Test2 {
	public static void main(String[] args){
		new Son();
	}

}
