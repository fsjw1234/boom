package net.fand.cheer.demo.ch15;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReaderWriterTest {
	public static void main(String[] args) {
		JFrame f = new TextEditorFrame();
		f.setVisible(true);
	}
}

class TextEditorFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static File editorFile = new File("F:/test/1.txt");

	public TextEditorFrame() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setTitle("hello world");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		final JTextArea content = new JTextArea();
		add(content, BorderLayout.CENTER);
		JButton readButton = new JButton("read");
		JButton writeButton = new JButton("write");

		readButton.addActionListener(new ActionListener() {

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
				} catch (Exception ee) {
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

		writeButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		southPanel.add(readButton);
		southPanel.add(writeButton);
		add(southPanel, BorderLayout.SOUTH);
	}
}