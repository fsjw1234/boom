package net.fand.cheer.home170522;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example1 extends JFrame {
	public Example1() {
		setLayout(null);
		setTitle("����һ��JFrame����");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
		
		JLabel jl=new JLabel("����һ��JFrame����");
		jl.setBounds(80, 40,100,150);   //setBounds(int x, int y, int width, int height)
		add(jl);
	}

	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.setVisible(true);
	}
}
