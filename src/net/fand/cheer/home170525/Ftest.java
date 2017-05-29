package net.fand.cheer.home170525;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ftest extends JFrame {
	private static File editorFile = new File("F:/test/word.txt");
	public Ftest() {
		setTitle("hello world");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		final JTextArea content = new JTextArea();
		add(content, BorderLayout.CENTER);
		
		JPanel jp = new JPanel();
		JButton jb1=new JButton("写入文件");
		JButton jb2=new JButton("读取文件");
		jp.add(jb1);
		jp.add(jb2);
		//jp.setLayout(new GridLayout(1, 2));
		add(jp, BorderLayout.SOUTH);

		jb2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				FileReader reader = null;
				try {
					reader = new FileReader(editorFile);
					char[] _content = new char[1024];
					int flag = -1;
					StringBuilder sb = new StringBuilder();

					while ((flag = reader.read(_content)) != -1) {
						String eachContent = new String(_content, 0, flag);
						sb.append(eachContent);
					}
					content.setText(sb.toString());
				} catch (Exception e1) {
					// TODO Auto-generated catch block

				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (Exception eee) {
						// TODO: handle exception
					}
				}
			}
		});

		jb1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				File file=new File("F:/test/word.txt");
				try{
					FileWriter out=new FileWriter(file);
					String s=content.getText();
					out.write(s);
					out.close();
				}catch(Exception e2){
					e2.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
		Ftest ft = new Ftest();
		ft.setVisible(true);
	}
}