import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Customer class");
		Cust_Frame customer = new Cust_Frame();
	}
	

}
class Cust_Frame extends JFrame{
	JLabel title;
	JLabel namet;
	JLabel addresst;
	JLabel emailt;
	JLabel mobilet;
	JLabel passwordt;
	JTextField name;
	JTextField email;
	JTextField address;
	JTextField mobile;
	JButton register;
	JPasswordField password;
	Cust_Frame(){
		
		//Fonts
		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
		Font  f1  = new Font(Font.DIALOG,  Font.BOLD, 25);
		
		//Labels
		title = new JLabel("Sign Up");
		namet = new JLabel("Name: ");
		namet.setBounds(220,150,100,50);
		emailt = new JLabel("Email: ");
		emailt.setBounds(220,250,100,50);
		addresst = new JLabel("Address: ");
		addresst.setBounds(220,350,100,50);
		mobilet = new JLabel("Mobile: ");
		mobilet.setBounds(220,450,100,50);
		passwordt = new JLabel("Password");
		passwordt.setBounds(220,550,100,50);
		
		title.setBounds(350,20,100,100);
		
		//TextFields
		name = new JTextField("enter your name");
		name.setBounds(380,150,200,50);
		email = new JTextField("abc@gmail.com");
		email.setBounds(380,250,200,50);
		address = new JTextField("houseno,street,city,pincode");
		address.setBounds(380,350,200,50);
		mobile = new JTextField("+91 1234567890");
		mobile.setBounds(380,450,200,50);
		password = new JPasswordField();
		password.setBounds(380,550,200,50);
		
		
		//color
		Color purp = new Color(122,136,222);
		
		//Button
		register = new JButton("Register");
		register.setBounds(350,680,100,50);
		register.setBackground(Color.yellow);
		register.setForeground(purp);
		
		//setting fonts
		title.setFont(f1);
		register.setFont(f3);
		namet.setFont(f3);
		addresst.setFont(f3);
		mobilet.setFont(f3);
		passwordt.setFont(f3);
//		Color cyan = new Color(171,219,230);
	
		
		//setting color
		this.getContentPane().setBackground(purp);
		namet.setForeground(Color.YELLOW);
		passwordt.setForeground(Color.YELLOW);
		mobilet.setForeground(Color.YELLOW);
		addresst.setForeground(Color.YELLOW);
		emailt.setForeground(Color.YELLOW);
		title.setForeground(Color.YELLOW);
		
		
		//padding
		name.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		email.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		address.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		mobile.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		password.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		//adding the components to the frame
		
		add(title);
		add(namet);
		add(emailt);
		add(addresst);
		add(mobilet);
		add(name);
		add(email);
		add(address);
		add(mobile);
		add(password);
		add(passwordt);
		add(register);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
	}
}
