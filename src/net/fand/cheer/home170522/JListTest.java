package net.fand.cheer.home170522;

import java.awt.*;

import javax.swing.*;

public class JListTest extends JFrame {
	public static void main(String[] args) {
		new JListTest();
	}

	public JListTest() {
		
		JPanel jp = new JPanel();
		JLabel jlb1 = new JLabel("ϲ���ĳ���");
		JLabel jlb2 = new JLabel("ϲ��������");
		String t1[] = { "����", "�Ϻ�", "����", "����" };
		JComboBox jcb1= new JComboBox(t1);
		String t2[] = { "1", "2", "3", "4", "5" };
		JList jl1=new JList(t2);
		jl1.setVisibleRowCount(2);
		JScrollPane jsp1= new JScrollPane(jl1);

		jp.add(jlb1);
		jp.add(jcb1);
		jp.add(jlb2);
		jp.add(jsp1);
	
		this.setLayout(new FlowLayout());

		add(jp);
		setSize(300, 300);
		//setLocation(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}