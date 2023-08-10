package feb;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class GUICase implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t1,t2,t3;

	public static void main(String[] args) {
		new GUICase();
	}
	
	GUICase() {
		f=new JFrame("CaseConverter");
		l1=new JLabel("First name");
		t1=new JTextField(10);
		l2=new JLabel("Last Name");
		t2=new JTextField(10);
		l3=new JLabel("Full Name");
		t3=new JTextField(10);
		b1=new JButton("Display Name");
		b2=new JButton("CLEAR");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		
		f.setLayout(new FlowLayout());
		f.setSize(550,250);
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			//String s=t1.getText();
			//String rs=s.toUpperCase();
		    //t2.setText(rs);
			t3.setText(t1.getText().toUpperCase()+" "+t2.getText().toUpperCase());
		}
		if(e.getSource()==b2) {
			t1.setText(null);
			t2.setText(null);
		}
		
	}

}
