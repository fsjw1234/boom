package net.fand.cheer.demo.ch13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScollPaneTest extends JFrame {
	public JScollPaneTest() {
		setTitle("hello world");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();

		JTextArea ta=new JTextArea(20,50);
		JScrollPane sp=new JScrollPane(ta);
		c.add(sp);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScollPaneTest();
	}

}
