package net.fand.cheer.demo.ch07;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition extends JFrame {
	String[] border = { BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };
	String[] buttonName = { "CENTER BUTTON", "NORTH BUTTON", "SOUTH BUTTON", "EAST BUTTON", "WEST BUTTON" };

	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < border.length; i++) {
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
}
