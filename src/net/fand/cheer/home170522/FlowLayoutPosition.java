package net.fand.cheer.home170522;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition(){
		setTitle("������ʹ�������ֹ�����");
		Container c=getContentPane();
		setLayout(new FlowLayout(1,20,20));//1Ϊ����  ��20&20Ϊˮƽ�ʹ�ֱ��϶
		for(int i=1;i<11;i++){
			c.add(new Button("button"+i));
		}
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new FlowLayoutPosition();
	}

}
