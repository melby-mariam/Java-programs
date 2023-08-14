package feb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIVelocity implements ActionListener {

	JFrame f;
	JPanel p;
	JLabel l1,l2,l3;
	JButton b1,b2;
	JTextField t1;
	
	GUIVelocity() {
		f=new JFrame("VELOCITY CONVERTER");
		p=new JPanel();
		l1=new JLabel("Velocity(in km/s)");
		t1=new JTextField(10);
		l2=new JLabel("Velocity(in m/s)");
		l3=new JLabel();
		b1=new JButton("CONVERT");
		b2=new JButton("RESET");
		
		
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(l3);
		p.add(b1);
		p.add(b2);
		f.add(p);
		
		f.setContentPane(p);
		f.setSize(500,500);
		f.setLayout(new GridLayout(5,2));
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			String s1=t1.getText();	
			int a=Integer.parseInt(s1);
			int ms=a*5/18;
			String s2=Integer.toString(ms);
			l3.setText(s2);
			}
		if(e.getSource()==b2) {
			t1.setText(null);
			l3.setText(null);
		}
	}
	
	public static void main(String[] args) {
		new GUIVelocity();
	}

}
