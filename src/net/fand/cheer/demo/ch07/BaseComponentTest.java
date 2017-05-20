package net.fand.cheer.demo.ch07;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class BaseComponentTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BaseComponentTest(){
		setTitle("hello world");
		setSize(600, 600);
		
		//setLayout(new GridLayout(10,1,5,5));
		JPanel radioGroupPanel=new JPanel();
		add(radioGroupPanel);
		//radioGroupPanel.setLayout(new FlowLayout());
		//ButtonGroup sexButtonGroup=new ButtonGroup();
		
		JRadioButton hanRadio=new JRadioButton("ºº×å");
		JRadioButton nohanRadio=new JRadioButton("·Çºº×å");
		//ButtonGroup nationButtonGroup=new ButtonGroup();
		//nationButtonGroup.add(hanRadio);
		//nationButtonGroup.add(nohanRadio);
		
		
		//sexButtonGroup.add(hanRadio);
		//sexButtonGroup.add(nohanRadio);
		
		radioGroupPanel.add(hanRadio);
		radioGroupPanel.add(nohanRadio);
		
	}
	
	public static void main(String[] args){
		JFrame frame=new BaseComponentTest();
		frame.setVisible(true);
	}

}
