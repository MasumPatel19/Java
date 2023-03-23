package com.training.programs;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jButtonEx {

	public static void main(String[] args) {
//		JFrame f = new JFrame("Button Example");
//		JButton b = new JButton("Click Here");
//		b.setBounds(50, 100, 95, 30);
//		f.add(b);
//		f.setSize(400, 400);
//		f.setLayout(null);
//		f.setVisible(true);
		
		JButton a = new JButton("Exit");
		JButton b = new JButton("Exit");
		JButton c = a;
		
		System.out.println("Is a == b?"+(a==b));
		System.out.println("Is a == c?"+(a==c));
		
		
	}
}
