package net.fand.cheer.home170607;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class FTest extends JFrame{
	public FTest(){
		//Container c=getContentPane();
		JPanel jp=new JPanel();
		add(jp);
		setTitle("hello world");
		setSize(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTextArea jt=new JTextArea(10,50);
		JScrollPane js=new JScrollPane(jt);
		jp.add(js);
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		FTest ft=new FTest();
		ft.setVisible(true);
	}
}


