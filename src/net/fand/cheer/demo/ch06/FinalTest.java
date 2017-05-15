package net.fand.cheer.demo.ch06;
import static java.lang.System.out;

public class FinalTest {
	private static String value="abc";	
	public static void main(String[] args){
		FinalDemo finalDemo=new FinalDemo();
		finalDemo.setDemoValue("abc");
		out.println(finalDemo.getDemoValue());
		out.println(finalDemo);
		
		FinalDemoChild child=new FinalDemoChild();
		child.setDemoValue("def");
		out.println(child);
	}
}

class FinalDemo{
	private String demoValue;

	public String getDemoValue() {
		return demoValue;
	}
	public void setDemoValue(String demoValue) {
		this.demoValue = demoValue;
	}
	public String toString(){
		return getClass().getName()+"[demoValue:"+getDemoValue()+"]";
	}
}

class FinalDemoChild extends FinalDemo{
	
}