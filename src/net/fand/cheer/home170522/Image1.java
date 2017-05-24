package net.fand.cheer.home170522;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class Image1 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Image1() {
		Container c = getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体", JLabel.CENTER);
		Icon icon = new ImageIcon("F:/test/b.jpg");
		jl.setIcon(icon);
		jl.setHorizontalAlignment(SwingConstants.CENTER);

		c.add(jl);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Image1();
	}
}
