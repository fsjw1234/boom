package net.fand.cheer.home170522;
import java.awt.FlowLayout;  

import javax.swing.JComboBox;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.border.EmptyBorder;  
  
public class JComboBoxDemo extends JFrame{  
    public JComboBoxDemo(){  
        setTitle("下拉列表框使用");  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setBounds(100,100,250,100);  
        JPanel jp=new JPanel();  
        //jp.setBorder(new EmptyBorder(5,5,5,5));  
        setContentPane(jp);  
        //jp.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));  
        JLabel label=new JLabel("请选择你的证件类型:");  
        jp.add(label);  
        JComboBox comboBox=new JComboBox();  
        comboBox.addItem("身份证");  
        comboBox.addItem("驾驶证");  
        comboBox.addItem("军官证");  
        jp.add(comboBox);  
        this.setVisible(true);  
    }  
    public static void main(String[]args){  
        JComboBoxDemo example=new JComboBoxDemo();  
    }  
}  
