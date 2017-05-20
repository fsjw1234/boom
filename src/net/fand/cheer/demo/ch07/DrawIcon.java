package net.fand.cheer.demo.ch07;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class DrawIcon implements Icon {
	private int width;
	private int height;

	public int getIconHeight() {
		return this.height;
	}

	public int getIconWidth() {
		return this.width;
	}

	public DrawIcon(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		// TODO Auto-generated method stub
		arg1.fillOval(x, y, width, height);
	}

	public static void main(String[] args) {
		DrawIcon icon = new DrawIcon(15, 15);
		JLabel j = new JLabel("≤‚ ‘", icon, SwingConstants.CENTER);
		JFrame jf = new JFrame();
		Container c = jf.getContentPane();
		c.add(j);
		jf.setSize(100,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
