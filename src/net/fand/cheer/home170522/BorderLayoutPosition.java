package net.fand.cheer.home170522;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutPosition extends JFrame{
	String[] border={BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] buttonName={"center","north","south","west","east"};
	public BorderLayoutPosition(){
		setTitle("这个窗体使用边界布局管理器");
		Container c=getContentPane();
		setLayout(new BorderLayout());
		for(int i=0;i<border.length;i++){
			c.add(border[i],new JButton(buttonName[i]));
		}
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new BorderLayoutPosition();
	}

}
