package feb;

import java.util.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class GUICounter implements ActionListener {
	
	JFrame f;
	JButton b1,b2,b3;
	JTextField t1;
	JPanel p;
	//int a=0;

	GUICounter() {
		f=new JFrame();
		//p=new JPanel();
		b1=new JButton("COUNT UP");
		b2=new JButton("COUNT DOWN");
		b3=new JButton("RESET");
		t1=new JTextField(10);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(t1);
		//f.add(p);
		
		f.setSize(500,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	public static void main(String[] args) {
		new GUICounter();

	}
	public void actionPerformed(ActionEvent e) {
		
		/*if(e.getSource()==b1) {
			a++;
			t1.setText(Integer.toString(a));
		}
		if(e.getSource()==b2) {
			a--;
			t1.setText(Integer.toString(a));
		}
		if(e.getSource()==b3) {
			
			t1.setText("0");
		}*/
		
		
		if(e.getSource()==b1) {
			String s=t1.getText();
			int a=Integer.parseInt(s);
			a++;
			String rs=String.valueOf(a);
			t1.setText(rs);
		}
		if(e.getSource()==b2) {
			String s=t1.getText();
			int a=Integer.parseInt(s);
			a--;
			String rs=String.valueOf(a);
			t1.setText(rs);
		}
		if(e.getSource()==b3) {
			t1.setText("0");
		}	
		}
	}


