package net.fand.cheer.home170522;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyDialog extends JDialog{
	public MyDialog(){
		setTitle("���");
		setSize(100,100);
		setBounds(100,100,200,100);
		
		JLabel jl=new JLabel("����һ��JFRAME����",JLabel.CENTER);
		add(jl);
}
	}

public class JDialog1 extends JFrame{
	public JDialog1(){
		setLayout(null);
		setTitle("hello world");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton jb=new JButton("�����Ի���");
		jb.setBounds(90, 110, 100, 20);
		add(jb);
		//JDialog jd=new JDialog();
		//jd.setTitle("hello world");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��������Ի���ť");
				new MyDialog().setVisible(true);
			}
		});
		
	}
	
	public static void main(String[] args){
		JDialog1 jd=new JDialog1();
		jd.setVisible(true);
	}

}
