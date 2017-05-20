package net.fand.cheer.demo.ch07;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public GridLayoutPosition(){
	Container c=getContentPane();
	setLayout(new GridLayout(7,3,5,5));
	for(int i=0;i<20;i++){
		c.add(new JButton("button"+i));
	}
	
	setSize(300, 300);
	setTitle("这是一个使用网络布局管理器的窗体");
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
}
public static void main(String[] args){
	new GridLayoutPosition();
}
}
