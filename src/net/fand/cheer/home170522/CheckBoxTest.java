package net.fand.cheer.home170522;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CheckBoxTest extends JFrame{
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextArea jt=new JTextArea(3,10);
	private JCheckBox jc1=new JCheckBox("1");
	private JCheckBox jc2=new JCheckBox("2");
	//private JCheckBox jc3=new JCheckBox("3");
	public CheckBoxTest(){
		Container c=getContentPane();
		setSize(300, 300);
		setTitle("复选框的使用");
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout());
		
		c.add(panel1,BorderLayout.NORTH);
		final JScrollPane scrollPane=new JScrollPane(jt);
		panel1.add(scrollPane);
		
		c.add(panel2, BorderLayout.SOUTH);
		panel2.add(jc1);
		jc1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc1.isSelected())
				jt.append("复选框1被选中\n");
			}
		});

		panel2.add(jc2);
		jc2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(jc2.isSelected())
				jt.append("复选框2被选中\n");
			}
		});

	}
	public static void main(String[] args){
		CheckBoxTest cb=new CheckBoxTest();
		cb.setVisible(true);
	}

}
