package net.fand.cheer.home170525;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleEvent extends JFrame{
	private static final long serialVersionUID = 1L;
	private JButton jb=new JButton("���ǰ�ť��������");
	public SimpleEvent(){
		setLayout(null);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cp=getContentPane();
		cp.add(jb);
		jb.setBounds(10, 10,200,60);
		jb.addActionListener(new jbAction());
		setVisible(true);
	}
	class jbAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {   //actionPerformed----ActionListener����ӿ�����ķ���
			jb.setText("�ұ�������");
		}
	}
	public static void main(String[] args) {
		new SimpleEvent();
	}
}
