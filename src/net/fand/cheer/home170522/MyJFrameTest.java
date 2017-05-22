package net.fand.cheer.home170522;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyJFrameTest extends JFrame {
	public MyJFrameTest() {
		setTitle("hello world!");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}

	public static void main(String[] args) {
		MyJFrameTest myJfTest = new MyJFrameTest();
		myJfTest.setVisible(true);
	}

}