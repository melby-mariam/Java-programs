package feb;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Traffic extends JPanel implements ActionListener {
	
	JRadioButton r1, r2, r3;
	Color red_c, yellow_c, green_c;

	Traffic() {
		
		setBounds(0,0,500,400);
		r1 = new JRadioButton("RED");
		r2 = new JRadioButton("YELLOW");
		r3 = new JRadioButton("GREEN");
		
		r1.setSelected(true);
		red_c = Color.red;
		yellow_c = getBackground();
		green_c = getBackground();
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		add(r1);
		add(r2);
		add(r3);

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
	}

	public void actionPerformed(ActionEvent e) {

		if (r1.isSelected()== true) {
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		else if (r2.isSelected()== true) {
			yellow_c = Color.yellow;
			red_c = getBackground();
			green_c = getBackground();
		}
		else if (r3.isSelected()== true) {
			green_c = Color.green;
			red_c = getBackground();
			yellow_c = getBackground();
		}
		repaint();
	}

	public static void main(String[] args) {
		Traffic gui = new Traffic();
		JFrame f = new JFrame("TRAFFIC SIGNAL");
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		f.add(gui);
	}
}
