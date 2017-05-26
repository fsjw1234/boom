package net.fand.cheer.home170525;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusEventTest extends JFrame{
	public FocusEventTest(){
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		setLayout(new FlowLayout());
		JLabel jb=new JLabel("标题");
		add(jb);
		JTextField jt1=new JTextField("请单击其他文本框",10);
		JTextField jt2=new JTextField("单击我",10);
		c.add(jt1);
		c.add(jt2);
		jt1.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				JOptionPane.showMessageDialog(null, "文本框失去焦点");
			}
			public void focusGained(FocusEvent e) {
			
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new FocusEventTest();
	}

}
