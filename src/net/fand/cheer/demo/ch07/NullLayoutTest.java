package net.fand.cheer.demo.ch07;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutTest extends JFrame {
	private static final long serialVersionUID = 1L;
	public NullLayoutTest() {
		setSize(400, 300);
		setTitle("hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		JLabel welcome = new JLabel("welcome");
		welcome.setBounds(100, 100, 70, 30);
		JLabel swing = new JLabel("swing");
		swing.setBounds(200, 70, 70, 40);
		add(welcome);
		add(swing);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullLayoutTest();
	}
}
