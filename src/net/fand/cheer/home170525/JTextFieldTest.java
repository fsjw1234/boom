package net.fand.cheer.home170525;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame {
	public JTextFieldTest() {
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLayout(new FlowLayout());
		JTextField jt = new JTextField("aaa", 20);
		JButton jb = new JButton("清除");
		c.add(jt);
		c.add(jb);
		jt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("触发事件");//点击enter，text显示触发事件
			}
		});
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jt.setText("");
				jt.requestFocus();//将焦点放在text文本框
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JTextFieldTest();
	}

}
