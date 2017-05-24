package net.fand.cheer.home170522;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Icon1 implements Icon{
	private int width;
	private int height;
	
	public Icon1(int width, int height){
		this.width=width;
		this.height=height;
	}
	public int getIconWidth() {
		return this.width;
	}
	public int getIconHeight() {
		return this.height;
	}
	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.fillOval(x,y,width,height);
	}
	
	public static void main(String[] args){
		Icon1 icon=new Icon1(50,50);
		JLabel jl=new JLabel("≤‚ ‘",icon,SwingConstants.CENTER);
		//JButton jb=new JButton("HELLO", icon);
		//jb.setBounds(90, 110, 200, 200);
		JFrame jf=new JFrame();
		Container c=jf.getContentPane();
		//c.setLayout(null);
		c.add(jl);
		//c.add(jb);
		jf.setTitle("hello world");
		jf.setSize(300,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
}
