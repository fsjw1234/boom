package net.fand.cheer.demo.ch15;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JiSuanqi extends JFrame{
	public JiSuanqi(){
		setTitle("¼ÆËãÆ÷");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//setLayout(new BorderLayout());
		JPanel jp=new JPanel();
		setContentPane(jp);//Ìæ»»JFrameµÄÈÝÆ÷--jp
		JTextField jt=new JTextField(25);
		jp.add(jt);
	
	}
	
	public static void main(String[] args) {
		JiSuanqi jsq=new JiSuanqi();
		jsq.setVisible(true);
	}
}
