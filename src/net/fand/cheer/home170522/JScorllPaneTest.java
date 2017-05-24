package net.fand.cheer.home170522;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScorllPaneTest extends JFrame{
	public JScorllPaneTest(){
		Container c=getContentPane();
		JTextArea jt=new JTextArea(20,50);
	    JScrollPane js=new JScrollPane(jt);
	    c.add(js);
	    setTitle("带滚动条的文字编译器");
	    setSize(200,200);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new JScorllPaneTest();
	}
}
