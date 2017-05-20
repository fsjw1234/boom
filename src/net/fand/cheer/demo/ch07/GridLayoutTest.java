package net.fand.cheer.demo.ch07;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame{
	public GridLayoutTest(){
		setSize(600,600);
		setTitle("hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(6,6,1,1));
		
		String[] buttonLabel1=new String[]{
				"loh","roh","or","xar","not","and",
				"|","mod","ce","c","<-","/",
				"A","B","7","8","9","*",
				"C","D","4","5","6","-",
				"E","F","1","2","3","+",
				"(",")","+-","0",".","="
		
		};
		for(int i=0;i<36;i++){
			JButton button=new JButton(buttonLabel1[i]+"");
			add(button);
			
			setVisible(true);
		}
	}
public static void main(String[] args){
	new GridLayoutTest();
}
}
