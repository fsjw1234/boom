package net.fand.cheer.home170525;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JTextAreaTest extends JFrame {
	public JTextAreaTest() {
		setSize(300, 300);
		setTitle("定义自动换行的文本域");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		JTextArea jt = new JTextArea("文本域", 6, 6);
		jt.setLineWrap(true);
		c.add(jt);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextAreaTest();
	}

}
