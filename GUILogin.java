package feb;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUILogin implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2;
	JPasswordField p1;
	
	GUILogin() {
		f=new JFrame("LOGIN PAGE");
		l1=new JLabel("UName");
		t1=new JTextField(15);
		l2=new JLabel("Pwd");
		p1=new JPasswordField(15);
		b1=new JButton("LOGIN");
		b2=new JButton("RESET");
		l3=new JLabel("");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(p1);
		f.add(b1);
		f.add(b2);
		f.add(l3);
		
		f.setSize(500,500);
		f.setLayout(new GridLayout(5,2));
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String s1=t1.getText();
		String s2=p1.getText();
		//String s3=l3.getText();
		
		if(e.getSource()==b1) {
			if(s1.equals("admin")&&s2.equals("admin123")) {
				l3.setText("Successfully logged in.Welcome to "+s1);
				//JFrame f1=new JFrame("MY PAGE");
				//f.add(f1);
			}
			else {
				l3.setText("Invalid User");
			}
		}
		if(e.getSource()==b2) {
			t1.setText(null);
			p1.setText(null);
			l3.setText(null);
		}
	}

	public static void main(String[] args) {
		new GUILogin();

	}

}
