package net.fand.cheer.home170620;

public class MyFirstRunnableTest {
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			new Thread(new MyFirstRunnable()).run();
		}
	}

}

class MyFirstRunnable implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try{
			Thread.sleep(3000);
			System.out.println("this is "+getClass().getName());
			
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	
	
}