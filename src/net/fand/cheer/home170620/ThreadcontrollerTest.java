package net.fand.cheer.home170620;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThreadcontrollerTest {
	public static void main(String[] args) {
		JFrame frame=new ThreadControllerFrame();
		frame.setVisible(true);
		
	}
}

class ThreadControllerFrame extends JFrame {
	private static Color[] colors = { Color.RED, Color.BLUE, Color.BLACK,
			Color.CYAN, Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.WHITE };
	private Thread liver;
	private JPanel main;
	private JButton startButton;
	private JButton breakButton;
	private JButton stopButton;
	private static int threadStatus = 0;

	public ThreadControllerFrame() {
		setTitle("Thread Control Test");
		setSize(200, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		main = new JPanel();
		add(main, BorderLayout.CENTER);
		JPanel commandPanel = new JPanel();
		add(commandPanel, BorderLayout.SOUTH);
		commandPanel.setLayout(new GridLayout(1, 3));

		startButton = new JButton("开始");
		breakButton = new JButton("暂停");
		stopButton = new JButton("结束");

		commandPanel.add(startButton);
		commandPanel.add(breakButton);
		commandPanel.add(stopButton);

		liver = new Thread(new Runnable() {
			int x = 30;
			int y = 50;

			@Override
			public void run() {
				// TODO 自动生成的方法存根
				while (threadStatus != 0) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (threadStatus == 1) {
						Random r = new Random();
						int index = r.nextInt(colors.length - 1);
						Graphics g = getGraphics();
						g.setColor(colors[index]);
						g.drawLine(x, y, 100, y++);
						if (y > 80) {
							y = 50;
						}
					}

				}
			}
		});
		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				liver.start();
				threadStatus = 1;
				// refrushButtonsStatus();
			}
		});
		
		breakButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				if(threadStatus==2){
					threadStatus=1;
				}else{
					threadStatus=2;
				}
			}
		});

		stopButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				threadStatus=0;
				System.exit(0);
			}
		});
	}

}