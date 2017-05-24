package net.fand.cheer.home170522;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonTest extends JFrame{
	public  JButtonTest(){
		Icon icon=new ImageIcon("F:/TEST/B.JPG");
		setLayout(new GridLayout(3,2));
		Container c=getContentPane();
		for(int i=0;i<5;i++){
			JButton j=new JButton("button"+i,icon);
			c.add(j);
			if(i%2==0){
				j.setEnabled(false);
			}
		}
		JButton jb=new JButton();
		jb.setMaximumSize(new Dimension(90,30));
		jb.setIcon(icon);//为按钮设置图标
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");//为按钮设置提示文字
		jb.setBorderPainted(false);
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"弹出对话框");
			}
		});
		c.add(jb);
		
		setTitle("创建带文字与图片的按钮");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JButtonTest();
	}
}
