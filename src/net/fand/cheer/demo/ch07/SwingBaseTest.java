package net.fand.cheer.demo.ch07;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingBaseTest extends JFrame {
	//static final long serialVersionUID=87031213213131L;
	public SwingBaseTest() {
		setSize(300, 200);
		setTitle("zhang san");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new MyJDailog(this);
		Icon myIcon=new MyIcon();
		JLabel welcome=new JLabel("hello world");
		add(welcome);
		//JLabel icon=new JLabel(myIcon);
		//add(icon);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SwingBaseTest();
	}
}
class MyJDailog extends JDialog{
	public MyJDailog(JFrame frame){
		setTitle("li si");
		setVisible(true);
		setSize(100, 50);
	}
}
class MyIcon implements Icon{
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.drawOval(0, 0, 10,10);
	}
	public int getIconWidth() {
		return 30;
	}
	public int getIconHeight() {
		return 30;
	}
}