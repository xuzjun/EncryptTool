package com.zx.x.EncryptToolSuit.MainFrame;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	
	public MainUI(int x, int y, int width, int height) {
		drawJFrame(x, y, width, height);
	}
	
	public void drawJFrame(int x, int y, int width, int height) {
		Container content = this.getContentPane();
		ImageIcon imgIcon = new ImageIcon("meta/lock.png");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Encrypt Tool Suit");
		this.setIconImage(imgIcon.getImage());
		this.setBounds(0, 0, screenSize.width, screenSize.height); 
		
		myPanel = new JPanel();
		sourceArea = new JTextArea();
		destinationArea = new JTextArea();

		sourceArea.setLineWrap(true);
		myPanel.setLayout(new GridLayout());
		myPanel.add(new JScrollPane(sourceArea));
		
		encodeButton = new JButton("Encrypt");
		myPanel.add(encodeButton);
		
		upperCaseButton = new JButton("UpperCase");
		myPanel.add(upperCaseButton);
		
		lowerCaseButton = new JButton("LowerCase");
		myPanel.add(lowerCaseButton);
		
		content.add(myPanel);
	}
}
