package net.fand.cheer.home170519;
import static java.lang.System.out;

class Parents{
	private final void doit(){
		out.println("父类.doit()");
	}
	final void doit2(){
		out.println("父类.doit2()");
	}
	public void doit3(){
		out.println("父类.doit3()");
	}
}

class Sub extends Parents{
	public final void doit(){
		System.out.println("子类.doit()");
	}
	//final void doit2(){} //final方法不能覆盖
	public void doit3(){
		out.println("子类.doit3()");
	}
}

public class FinalMethod {
	public static void main(String[] args){
		Sub s=new Sub();
		s.doit();
		Parents p=s;
		p.doit2();
		p.doit3();
	}

}
