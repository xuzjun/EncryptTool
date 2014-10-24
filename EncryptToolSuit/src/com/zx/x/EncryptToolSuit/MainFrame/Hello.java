package com.zx.x.EncryptToolSuit.MainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Hello extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3285339749766301364L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello frame = new Hello();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(1, 4));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
		//panel1.setLayout(new GridLayout(4, 1));
		
		JPanel panel2 = new JPanel();
		panel1.setLayout(new GridLayout(1, 1));
		
		JPanel panel3 = new JPanel();
		panel1.setLayout(new GridLayout(1, 1));
		
		JPanel panel4 = new JPanel();
		panel1.setLayout(new GridLayout(1, 1));
		
		contentPane.add(panel1);
		contentPane.add(panel2);
		
		Rectangle r = new Rectangle(50, 50);
		//JScrollPane scrollPane = new JScrollPane();
//		scrollPane.setBounds(r);
		//panel2.add(scrollPane);
		
		//JTextArea src = new JTextArea();
		
		//src.setBounds(r);
		//scrollPane.add(src);
		
		contentPane.add(panel3);
		contentPane.add(panel4);
		
		JRadioButton rbtn1 = new JRadioButton("MD5");
		JRadioButton rbtn2 = new JRadioButton("BASE64");
		JRadioButton rbtn3 = new JRadioButton("RSA");
		JRadioButton rbtn4 = new JRadioButton("URL");
		
		panel1.add(rbtn1);
		panel1.add(rbtn2);
		panel1.add(rbtn3);
		panel1.add(rbtn4);
	
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rbtn1);
//		bg.add(rbtn2);
//		bg.add(rbtn3);
//		bg.add(rbtn4);
	}
}
