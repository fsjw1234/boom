package net.fand.cheer.home170522;

import javax.swing.JFrame;

public class Demo extends JFrame {
	public Demo() {
		setTitle("hello world");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Demo demo1 = new Demo();
		demo1.setVisible(true);
	}
}
