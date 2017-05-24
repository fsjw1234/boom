package net.fand.cheer.home170522;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 extends JFrame{
	private static final long serialVersionUID = 1L;

	public JFrame1(){
		setTitle("hello world");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jl=new JLabel("这是一个JFRAME窗体",JLabel.CENTER);
		add(jl);
	}

	public static void main(String[] args){
		JFrame1 jf=new JFrame1();
		jf.setVisible(true);
	}

}
