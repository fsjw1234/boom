package net.fand.cheer.demo.ch07;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
	public BorderLayoutTest(){
		setSize(400, 300);
		setTitle("hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JButton center=new JButton("center");
		add(center,BorderLayout.CENTER);
		
		/*JButton east=new JButton("east");
		add(east,BorderLayout.EAST);*/
		
		JButton south=new JButton("south");
		add(south,BorderLayout.SOUTH);
		
		JButton west=new JButton("west");
		add(west,BorderLayout.WEST);
		
		JButton north=new JButton("north");
		add(north,BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args){
		new BorderLayoutTest();
	}
}
