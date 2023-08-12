package feb;

		import java.awt.BorderLayout;
import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import javax.swing.*;
		
		public class GUISimpleCalculator implements ActionListener {
		
			JFrame f;
		    JButton b1,b2,b3;
		    JTextField tf1,tf2,tf3;
		    JLabel l1,l2,l3;
		    
		    GUISimpleCalculator(){
		    	f=new JFrame("Simple calculator");
		    	tf1=new JTextField(15);
		    	tf2=new JTextField(15);
		    	tf3=new JTextField(15);
		    	b1=new JButton("Add");
				b2=new JButton("Subtract");
				b3=new JButton("CLEAR");
				l1=new JLabel("Number 1");
				l2=new JLabel("Number 2");
				l3=new JLabel("Result   :  ");
				
				f.add(l1);
				f.add(tf1);
				f.add(l2);
				f.add(tf2);
				f.add(l3);
				f.add(tf3);
				f.add(b1);
				f.add(b2);
				f.add(b3);
				
				f.setLayout(new FlowLayout());
				f.setSize(250,220);
				f.setVisible(true);
				
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				
		    }

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
				tf3.setText(Integer.toString(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));	
			}
			if(e.getSource()==b2) {
				tf3.setText(Integer.toString(Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText())));	
			}
			if(e.getSource()==b3) {
				tf1.setText(null);	
				tf2.setText(null);
				tf3.setText(null);
			}
			
		}
	public static void main(String[] args) {
			
		new GUISimpleCalculator();

		}
	}
	
	
