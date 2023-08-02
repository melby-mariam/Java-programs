package Internal;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Swing implements ActionListener {
	JTextField t;
	JLabel l;
	JButton b1,b2,b3;
	JPanel p;
	JFrame f;
	
	Swing(){
		t=new JTextField(10);
		l=new JLabel("Counter");
		b1=new JButton("Count Up");
		b2=new JButton("Count Down");
		b3=new JButton("Reset");
		JPanel p=new JPanel();
		JFrame f=new JFrame();
		
		t.setBounds(180,50,150,50);
		l.setBounds(100,60,50,30);
		b1.setBounds(250,150,60,20);
		b2.setBounds(300,150,60,20);
		b3.setBounds(350,150,60,20);
		
		p.add(t);
		p.add(l);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		f.setSize(500,500);
		f.setContentPane(p);
		p.setLayout(new FlowLayout((FlowLayout.LEFT)));
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Swing();
	}
	public void actionPerformed(ActionEvent e) {
		int n;
		if(e.getSource()==b1) {
			String num=t.getText();
			n=Integer.parseInt(num);
			n++;
			num=String.valueOf(n);
			t.setText(num);
			
		}
		
			
			
		}
}
