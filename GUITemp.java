package feb;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUITemp implements ActionListener {

	JFrame f;
	JPanel p;
	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1,t2;
	
	GUITemp() {
		f=new JFrame("TEMPERATURE CONVERTER");
		p=new JPanel();
		l1=new JLabel("Celcius(in degrees)");
		t1=new JTextField(10);
		l2=new JLabel("Fahreinheit");
		//t2=new JTextField(10);
		l3=new JLabel();
		b1=new JButton("CONVERT");
		b2=new JButton("RESET");
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		//p.add(t2);
		p.add(l3);
		p.add(b1);
		p.add(b2);
		f.add(p);
		
		f.setContentPane(p);
		f.setSize(360,400);
		f.setLayout(new GridLayout(5,2));
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			//l3.setText(Integer.toString((Integer.parseInt(t1.getText()) *9/5)+32));
			String s1=t1.getText();
			int a=Integer.parseInt(s1);
			 int fr=(a*9/5)+32;
			String s2=Integer.toString(fr);
			l3.setText(s2);
		}
		if(e.getSource()==b2) {
			l3.setText(null);
			t1.setText(null);
		}
		
	}
	
	public static void main(String[] args) {
		new GUITemp();
		
	}

}
