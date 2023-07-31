package Internal;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui implements ActionListener {
	JTextField t;
	JLabel l1,l2,l3;
	JButton b1,b2;
	JPanel p;
	JFrame f;
	
	gui(){
		t=new JTextField();
		l1=new JLabel("Java");
		l2=new JLabel("CS");
		l3=new JLabel("SJCET");
		b1=new JButton("B1");
		b2=new JButton("B2");
		JPanel p=new JPanel();
		JFrame f=new JFrame();
		
		t.setBounds(180,50,150,50);
		l1.setBounds(200,100,50,30);
		l2.setBounds(250,100,50,30);
		l3.setBounds(300,100,50,30);
		b1.setBounds(160,150,60,50);
		b2.setBounds(260,150,60,50);
		
		p.add(t);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(b1);
		p.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f.setSize(400,450);
		f.setContentPane(p);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new gui();
	}
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==b1) {
		t.setText("Hello");
	}
	if(e.getSource()==b2) {
		t.setText("Hi Java");
	}
}
}
