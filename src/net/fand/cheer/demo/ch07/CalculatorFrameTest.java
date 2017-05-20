package net.fand.cheer.demo.ch07;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrameTest extends JFrame {
	public CalculatorFrameTest() {
		setSize(400, 250);
		setTitle("hello world");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JTextField showField = new JTextField("0");
		
		showField.setHorizontalAlignment(JTextField.RIGHT);
		showField.setText("0");
		//showField.setAlignmentX(RIGHT_ALIGNMENT);
		add(showField, BorderLayout.CENTER);
		// showField.setSize(400,150);

		JPanel center = new JPanel();
		add(center, BorderLayout.SOUTH);
		center.setLayout(new GridLayout(6, 6, 1, 1));

		String[] buttonLabel = new String[] { 
				"loh", "roh", "or", "xar", "not", "and", 
				"|", "mod", "ce", "c", "<-",
				"/", "A", "B", "7", "8", "9", "*", 
				"C", "D", "4", "5", "6", "-", 
				"E", "F", "1", "2", "3", "+", 
				"(", ")","+-", "0", ".", "="
		};

		for (int i = 0; i < 36; i++) {
			JButton button = new JButton(buttonLabel[i]);
			center.add(button);
			if("".equals(buttonLabel[i])){
				button.setEnabled(false);
			}
		}

		setVisible(true);
	}

	public static void main(String[] args) {
		JFrame frame = new CalculatorFrameTest();
		frame.setVisible(true);
	}
}
