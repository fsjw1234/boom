package net.fand.cheer.home170519;
import static java.lang.System.out;

class Parents{
	private final void doit(){
		out.println("����.doit()");
	}
	final void doit2(){
		out.println("����.doit2()");
	}
	public void doit3(){
		out.println("����.doit3()");
	}
}

class Sub extends Parents{
	public final void doit(){
		System.out.println("����.doit()");
	}
	//final void doit2(){} //final�������ܸ���
	public void doit3(){
		out.println("����.doit3()");
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
