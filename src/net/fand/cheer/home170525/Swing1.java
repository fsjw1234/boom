package net.fand.cheer.home170525;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Swing1 extends JFrame{
	public void CreateJFrame(String title){
		JFrame jf=new Swing1();
		Container c=jf.getContentPane();
		JLabel jl=new JLabel("这是个jframe窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(jl);
		c.setBackground(Color.BLUE);
		jf.setSize(300, 300);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setUndecorated(true);//必须这样设置不然 setOpacity 抛出异常
		jf.setOpacity(0.4f);//如果不设置 setUndecorated(true) 将会抛出异常
		jf.setVisible(true);
	}
	public static void main(String[] args){
		new Swing1().CreateJFrame("创建一个JFrame窗体");
	}
}
