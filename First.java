package DSA_Learning;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class First extends JFrame{

	JTextField cardTextField;
	JPasswordField pinTextField;
	JButton login, signup, clear;
	
	First(){
		
		this.setTitle("AUTOMATED TELLER MACHINE");
		
//		this.setLayout(null);
		
		Font font1 = new Font("Raleway",Font.BOLD, 28);
		Font font2 = new Font("Arial", Font.BOLD, 14);
		
		// Label and TextField
		
		JLabel text = new JLabel("WelCome to ATM");
		text.setForeground(Color.BLUE);
		text.setFont(new Font("Osward",Font.BOLD,38));
		text.setBounds(200, 40, 400, 40);
		this.add(text);
		
		JLabel cardno = new JLabel("Card no");
		cardno.setFont(font1);
		cardno.setBounds(120, 150, 400, 40);
		this.add(cardno);
		
		
		JLabel pin = new JLabel("PIN");
		pin.setFont(font1);
		pin.setBounds(120, 220, 400, 40);
		this.add(pin);
		
		this.cardTextField = new JTextField();
		this.cardTextField.setBounds(300, 150, 230, 30);
		this.cardTextField.setFont(font2);
		this.add(this.cardTextField);
		
		this.pinTextField = new JPasswordField();
		this.pinTextField.setBounds(300, 220, 230, 30);
		this.pinTextField.setFont(font2);
		this.add(this.pinTextField);
		
		// Button
		
		this.login = new JButton("SIGN IN");
		this.login.setBounds(300, 300, 100, 30);
		this.login.setBackground(Color.BLACK);
		this.login.setForeground(Color.WHITE);
		this.add(this.login);
		
		this.clear = new JButton("CLEAR");
		this.clear.setBounds(430, 300, 100, 30);
		this.clear.setBackground(Color.BLACK);
		this.clear.setForeground(Color.WHITE);
		this.add(this.clear);
		
		this.signup = new JButton("SIGN UP");
		this.signup.setBounds(300, 350, 230, 30);
		this.signup.setBackground(Color.BLACK);
		this.signup.setForeground(Color.WHITE);
		this.add(this.signup);
		
		ImageIcon i1 = new ImageIcon("C:\\Users\\admin\\Pictures\\Assignment\\ORE.jpg");
		Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		add(image);
		
		this.getContentPane().setBackground(Color.WHITE);
        this.setSize(800,450);
        this.setVisible(true);
        this.setLocation(350,200);
	}
	public static void main(String[] args) {
		System.out.println("Start:");
		new First();		
		System.out.println("End:");
	}
}
