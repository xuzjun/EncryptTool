package com.zx.x.EncryptToolSuit.Test;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

@SuppressWarnings("serial")
public class JFrameLayout extends JFrame {

	private JPanel p1, p2, p3, p4;

	public JFrameLayout() {

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();

		p1.setPreferredSize(new Dimension(300, 50));

		JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p2, p3);
		jsp.setDividerLocation(100);

		p4.setPreferredSize(new Dimension(300, 50));

		getContentPane().add(p1, BorderLayout.NORTH);
		getContentPane().add(jsp);
		getContentPane().add(p4, BorderLayout.SOUTH);

		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameLayout();
	}
}
