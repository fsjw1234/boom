package net.fand.cheer.home170522;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	public JPanelTest(){
		Container c=getContentPane();
		c.setLayout(new GridLayout(2,1));
		JPanel p1=new JPanel(new GridLayout(1,3));
		JPanel p2=new JPanel(new GridLayout(1,2));
		JPanel p3=new JPanel(new GridLayout(1,4));
		JPanel p4=new JPanel(new GridLayout(1,5));
		p1.add(new JButton("1")); // 在面板中添加按钮
		p1.add(new JButton("1"));
		p1.add(new JButton("1"));
		p1.add(new JButton("1"));
		p2.add(new JButton("2"));
		p2.add(new JButton("2"));
		p3.add(new JButton("3"));
		p3.add(new JButton("3"));
		p4.add(new JButton("4"));
		p4.add(new JButton("4"));
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		setTitle("在这个窗体中使用了面板");
		setSize(420, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	
	
	public static void main(String[] args){
		new JPanelTest();
	}
}
