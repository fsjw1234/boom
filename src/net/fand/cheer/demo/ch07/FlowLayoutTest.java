package net.fand.cheer.demo.ch07;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FlowLayoutTest extends JFrame {
	public FlowLayoutTest() {
		setSize(400, 300);
		setTitle("hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));
        for(int i=0;i<10;i++){
        	JLabel label=new JLabel("welcome");
        	add(label);
        }
        
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
