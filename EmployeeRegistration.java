package Assignment;

package lab22;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class EmployeeRegistration implements ActionListener {
Connection con;
JTextField t1,t2,t3,t4,t6;
JPasswordField p1;
JTextArea t5;
JRadioButton r1,r2;
JComboBox jc;
JButton b1,b2;
EmployeeRegistration() {
JFrame f=new JFrame("Employee Details");
JPanel p=new JPanel();
JPanel p2=new JPanel();
p2.setLayout(new FlowLayout());
JLabel l1=new JLabel("Full Name");
t1=new JTextField();
JLabel l2=new JLabel("Address");
t5=new JTextArea();
JLabel l3=new JLabel("Gender");
r1=new JRadioButton("Male");
r2=new JRadioButton("Female");
p2.add(r1);
p2.add(r2);
JLabel l4=new JLabel("Age");
t2=new JTextField();
JLabel l5=new JLabel("Email");
t3=new JTextField();
JLabel l6=new JLabel("Phone");
t4=new JTextField();
JLabel l7=new JLabel("Designation");
String name[]= {"Tester","Developer","Programmer","Manager"};
jc=new JComboBox(name);
JLabel l8=new JLabel("Username");
t6=new JTextField();
JLabel l9=new JLabel("Password");
p1=new JPasswordField();
b1=new JButton("Reset");
b2=new JButton("Submit");
p.add(l1); p.add(t1);
p.add(l2); p.add(t5);
p.add(l3); p.add(p2);
p.add(l4); p.add(t2);
p.add(l5); p.add(t3);
p.add(l6); p.add(t4);
p.add(l7); p.add(jc);
p.add(l8); p.add(t6);
p.add(l9); p.add(p1);
p.add(b1); p.add(b2);
p.setLayout(new GridLayout(10,2));
r1.addActionListener(this);
r2.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
jc.addActionListener(this);
t1.addActionListener(this);
f.setContentPane(p);
f.setSize(1000,1000);
f.setVisible(true);

}
public static void main(String args[])
{
new EmployeeRegistration();
}
public void actionPerformed(ActionEvent e)
{
	try
	{
	String userName="root",password="";
	String url="jdbc:mysql://localhost/test";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,userName,password);
	Statement st=con.createStatement();
	if(e.getSource()==b2)
	{
	String empname=t1.getText();
	String address=t5.getText();
	String gender;
	if(e.getSource()==r1)
	gender="Male";
	else
	gender="Female";

	int age=Integer.parseInt(t2.getText());
	String email=t3.getText();
	Integer phone=Integer.parseInt(t4.getText());
	String Desig;
	if(jc.getName()=="Developer")
	Desig="Developer";
	else if(jc.getName()=="Tester")
	Desig="Tester";
	else if(jc.getName()=="Manager")
	Desig="Manager";
	else
	Desig="Programmer";
	String user=t6.getText();
	String pword=p1.getText();
	String sql="insert into student (empname,address,gender,age,email,phone,Designation,Username"
			+ ",password) values("+empname+","+add