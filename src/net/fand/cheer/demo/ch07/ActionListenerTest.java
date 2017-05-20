package net.fand.cheer.demo.ch07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListenerTest extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ActionListenerTest() {
		setTitle("hello world");
		setSize(200,200);
		JButton exit=new JButton();
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("click exit");
				System.exit(0);
			}
		});
		add(exit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new ActionListenerTest();
		frame.setVisible(true);
	}
     
}
