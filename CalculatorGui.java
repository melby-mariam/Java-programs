package feb;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;


public class CalculatorGui implements ActionListener  {
	JFrame f;
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t1,t2,t3;
	
	CalculatorGui() {
		
		f=new JFrame("Calculator");
		l1=new JLabel("Number 1");
		t1=new JTextField(15);
		l2=new JLabel("Number 2");
		t2=new JTextField(15);
		l3=new JLabel("Result");
		t3=new JTextField(15);
		b1=new JButton("ADD");
		b2=new JButton("SUBTRACT");
		b3=new JButton("CLEAR");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setSize(250,200);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new CalculatorGui();
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			t3.setText(Integer.toString(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));
		}
		if(e.getSource()==b2) {
			t3.setText(Integer.toString(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
		}
		if(e.getSource()==b3) {
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
		}
	}
}

