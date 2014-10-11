package com.zx.x.EncryptToolSuit.MainFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainUI extends JFrame {
	
	private JButton encodeButton;
	private JButton upperCaseButton;
	private JButton lowerCaseButton;
	private JPanel myPanel;
	private JTextArea sourceArea;
	private JTextArea destinationArea;
	private JCheckBox md5Check;
	
	public MainUI() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Encrypt Tool Suit");
		this.setBounds(70, 70, 400, 400); 
		
		myPanel = new JPanel();
		sourceArea = new JTextArea();
		destinationArea = new JTextArea();
		md5Check = new JCheckBox();

		sourceArea.setLineWrap(true);
		myPanel.setLayout(new GridLayout());
		myPanel.add(md5Check);
		myPanel.add(new JScrollPane(sourceArea));
		this.add(myPanel);
	}
}
