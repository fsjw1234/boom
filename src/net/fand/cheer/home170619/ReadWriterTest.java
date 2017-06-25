package net.fand.cheer.home170619;

import java.awt.BorderLayout;
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

public class ReadWriterTest {
	public static void main(String[] args) {
		JFrame f = new TextEditorFrame();
		f.setVisible(true);
	}
}

class TextEditorFrame extends JFrame {
	private static File editorFile = new File("E:/test/test/editor.txt");

	public TextEditorFrame() {
		setTitle("text editor");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		final JTextArea content = new JTextArea();
		add(content, BorderLayout.CENTER);
		JButton readButton = new JButton("reader");
		JButton writeButton = new JButton("writer");
		readButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				FileReader reader = null;
				try {
					reader = new FileReader(editorFile);
					char[] _content = new char[1024];
					int flag = -1;
					StringBuilder sb = new StringBuilder();
					while ((flag = reader.read(_content)) != -1) {
						String eachContent = new String(_content);
						sb.append(eachContent);
					}
					content.setText(sb.toString());
				} catch (Exception ee) {
					ee.printStackTrace();
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (Exception eee) {

					}
				}

			}
		});
		writeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				FileWriter writer = null;
				try {
					writer = new FileWriter(editorFile);
					String text = content.getText();
					writer.write(text);
					writer.flush();
				} catch (Exception ee) {

				} finally {
					try {
						if (writer != null) {
							writer.close();
						}
					} catch (Exception eee) {

					}
				}
			}

		});
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 2));
		southPanel.add(readButton);
		southPanel.add(writeButton);
		add(southPanel, BorderLayout.SOUTH);

	}

}