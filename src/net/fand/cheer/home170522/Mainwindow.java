package net.fand.cheer.home170522;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Mainwindow extends JFrame {
	public Mainwindow() {
		setTitle("图书管理系统");
		setSize(500, 500);
		setBackground(Color.white);

		Container con = getContentPane();
		JPanel panel = new JPanel();
		JButton button1 = new JButton("借出");
		JButton button2 = new JButton("归还");
		JButton button3 = new JButton("关于");
		JLabel label = new JLabel(new ImageIcon("F:/test/b.jpg"));
		//panel.setBounds(0, 0, 500, 500);
		con.add(panel);
		panel.setLayout(null);
		button1.setBounds(5, 25, 60, 30);
		panel.add(button1);
		button2.setBounds(70, 25, 60, 30);
		panel.add(button2);
		button3.setBounds(135, 25, 60, 30);
		panel.add(button3);
		label.setBounds(0, 60, 638, 450);
		panel.add(label);
	}
	
	public static void main(String[] args){
		Mainwindow mw=new Mainwindow();
		mw.setVisible(true);
	}
}