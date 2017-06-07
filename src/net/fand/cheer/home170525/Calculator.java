package net.fand.cheer.home170525;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {
	private static final long serialVersionUID = -9075562467166618473L;
	private JPanel contentPane;
	private JTextField display;
	private ActionListener insert = new InsertAction();
	private ActionListener command = new CommandAction();
	private double result = 0;
	private String lastCommand = "=";
	private boolean start = true;

	public static void main(String[] args) {
					Calculator frame = new Calculator();
					frame.setVisible(true);
	}

	public Calculator() {
		setTitle("计算器");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);

		JPanel displayPanel = new JPanel();

		contentPane.add(displayPanel, BorderLayout.NORTH);

		display = new JTextField();

		display.setText("0");//文本框内容初始化为0
		display.setHorizontalAlignment(SwingConstants.LEFT);//文本框内容从左
		display.setEditable(false);//不可编辑
		display.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		displayPanel.add(display);
		display.setColumns(13);

		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.CENTER);
		buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

		JButton number7Button = new JButton("7");
		number7Button.addActionListener(insert);
		buttonPanel.add(number7Button);

		JButton number8Button = new JButton("8");
		number8Button.addActionListener(insert);
		buttonPanel.add(number8Button);

		JButton number9Button = new JButton("9");
		number9Button.addActionListener(insert);
		buttonPanel.add(number9Button);

		JButton divideButton = new JButton("/");
		divideButton.addActionListener(command);
		buttonPanel.add(divideButton);

		JButton number4Button = new JButton("4");
		number4Button.addActionListener(insert);
		buttonPanel.add(number4Button);

		JButton number5Button = new JButton("5");
		number5Button.addActionListener(insert);
		buttonPanel.add(number5Button);

		JButton number6Button = new JButton("6");
		number6Button.addActionListener(insert);
		buttonPanel.add(number6Button);

		JButton multiplyButton = new JButton("*");
		multiplyButton.addActionListener(command);
		buttonPanel.add(multiplyButton);

		JButton number3Button = new JButton("1");
		number3Button.addActionListener(insert);
		buttonPanel.add(number3Button);

		JButton number2Button = new JButton("2");
		number2Button.addActionListener(insert);
		buttonPanel.add(number2Button);

		JButton number1Button = new JButton("3");
		number1Button.addActionListener(insert);
		buttonPanel.add(number1Button);

		JButton subtractButton = new JButton("-");
		subtractButton.addActionListener(command);
		buttonPanel.add(subtractButton);

		JButton number0Button = new JButton("0");
		number0Button.addActionListener(insert);
		buttonPanel.add(number0Button);
		
		JButton dotButton = new JButton(".");
		buttonPanel.add(dotButton);

		JButton equalButton = new JButton("=");
		equalButton.addActionListener(command);
		buttonPanel.add(equalButton);

		JButton addButton = new JButton("+");
		addButton.addActionListener(command);
		buttonPanel.add(addButton);

		pack();

	}

	//点击按钮在文本框中显示对应数字
	private class InsertAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			String input = e.getActionCommand();
			String text = display.getText();
			if (start) {
				display.setText("");
				start = false;
			}
			if (text.startsWith(".")) {
				display.setText("0" + display.getText() + input);
			} else if (text.startsWith("-0.") || text.startsWith("0.")) {
				display.setText(display.getText() + input);
			} else if (text.startsWith("-0")) {
				display.setText("-" + input);
			} else if (text.startsWith("0")) {
				display.setText(input);
			} else {

				display.setText(display.getText() + input);
			}
		}
	}

	private class CommandAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (start) {
				if (command.equals("-")) {
					display.setText(command);
					start = false;
				} else {
					lastCommand = command;
				}
			} else {
				calculate(Double.parseDouble(display.getText()));
				lastCommand = command;
				start = true;
			}
		}
	}
	public void calculate(double x) {
		char operator = lastCommand.charAt(0);
		switch (operator) {
		case '+':
			result += x;
			break;
		case '-':
			result -= x;
			break;
		case '*':
			result *= x;
			break;
		case '/':
			result /= x;
			break;
		case '=':
			result = x;
			break;
		}
		display.setText("" + result);
	}
}
