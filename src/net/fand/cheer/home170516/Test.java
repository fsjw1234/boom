package net.fand.cheer.home170516;
import static java.lang.System.out;

class Fu{
	Fu(){
		show();
	}
	void show(){
		out.print("haha");
	}
}

class Zi extends Fu{
	int num=9;
	Zi(){
		out.println("zi constructor.."+num);
	}
	void show(){
		out.println("show.."+num);
	}
}
public class Test {
	public static void main(String[] args){
		new Zi();
	}

}
