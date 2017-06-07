package net.fand.cheer.home170525;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jsq extends JFrame{
	private static final long serialVersionUID = 1L;
	public Jsq(){
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("计算器");
		setLayout(new FlowLayout());
		Container c=getContentPane();
		JTextField jt=new JTextField(15);
		c.add(jt);
		JButton jb1=new JButton("加");
		JButton jb2=new JButton("减");
		JButton jb3=new JButton("乘");
		JButton jb4=new JButton("除");
		JButton jb5=new JButton("等于");
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		String [] button = new String[]{
				"7","8","9",
				"4","5","6",
				"1","2","3",
				"0"
		};
		for(int i=0;i<button.length;i++){
			JButton b=new JButton(button[i]);
			c.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton jb = (JButton)e.getSource();
					String t=jb.getText();
					jt.setText(t);
				}
			});
		}
	}
	public static void main(String[] args) {
		Jsq j=new Jsq();
		j.setVisible(true);
	}
}


