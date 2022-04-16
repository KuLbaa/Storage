package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class LoginFrame extends JFrame implements ActionListener {
	
	JLabel Login, Password, LoginText, LogoLabel, LoginFieldPanel, PasswordFieldPanel, lblNewLabel;
	JTextField LoginField;
	JPasswordField PasswordField;
	String login, password;
	JButton LoginButton;
	ArrayList<User> Users;

	
	public LoginFrame() {
		super("The Simpsons");
		
		Users = new ArrayList<User>();
		User admin = new User ("admin", "123");
		User nati = new User ("Nati", "111");
		User jacob = new User ("Jacob", "pjatk");
		Users.add(admin);
		Users.add(nati);
	
		LoginField = new JTextField("");
		PasswordField = new JPasswordField();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(300, 300); //300, 280
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);		
		
		Login = new JLabel("Login:", JLabel.CENTER);
		Password = new JLabel("Password:", JLabel.CENTER);
		LoginText = new JLabel("Please enter your login", JLabel.CENTER);
		LoginButton = new JButton("Click to Log in");

		Font font = new Font("SanSerif", Font.BOLD, 25);
		Font font1 = new Font("SanSerif", Font.BOLD, 15);
		
		Login.setBounds(-60, 25, 300, 280);
		Login.setForeground(Color.WHITE);
		Login.setFont(font);
		
		Password.setBounds(0, 5, 130, 390);
		Password.setForeground(Color.WHITE);
		Password.setFont(font);

		LoginButton.setBackground(Color.LIGHT_GRAY);
		LoginButton.setForeground(Color.WHITE);
		LoginButton.setBorder(new LineBorder(Color.LIGHT_GRAY));
		LoginButton.setFont(font1);
		LoginButton.setBounds(100, 225, 110, 30);
		
		LoginField.setFont(font1);
		LoginField.setHorizontalAlignment(JTextField.LEFT);
		LoginField.setBackground(Color.DARK_GRAY);
		LoginField.setForeground(Color.WHITE);
		LoginField.setBorder(new LineBorder(Color.WHITE));
		LoginField.setBounds(130, 157, 140, 20);
		LoginField.setCaretColor(Color.WHITE);
		
		PasswordField.setFont(font1);
		PasswordField.setHorizontalAlignment(JTextField.LEFT);
		PasswordField.setBackground(Color.DARK_GRAY);
		PasswordField.setForeground(Color.WHITE);
		PasswordField.setBorder(new LineBorder(Color.WHITE));
		PasswordField.setBounds(130, 192, 140, 20);
		PasswordField.setCaretColor(Color.WHITE);
		
		LoginText.setBounds(0, 25, 300, 230);
		LoginText.setForeground(Color.WHITE);
		LoginText.setFont(font1);
		
		LoginButton.addActionListener(this);
		getContentPane().add(Login);
		getContentPane().add(Password);
		getContentPane().add(LoginText);
		//add(LogoLabel);
		getContentPane().add(LoginField);
		getContentPane().add(PasswordField);
		getContentPane().add(LoginButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png"));
		lblNewLabel.setBounds(70, 0, 150, 140);
		getContentPane().add(lblNewLabel);
		lblNewLabel.repaint();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		login = LoginField.getText();
		password = PasswordField.getText();
		boolean checkLogin = false;
		User checkUser = null;
		for(User i: Users) {
			
			if(i.name.equals(login)) {
				
				checkLogin = true;
				checkUser = i;
			}
			
		}
		
		if(checkLogin == true) {
			
			if(checkUser.GetPassword().equals(password)) {
				
				JOptionPane.showMessageDialog(Login, "You are sucessfully logined !");
				MainFrame MF = new MainFrame();
				setVisible(false);
				
			}
			else {
				
				JOptionPane.showMessageDialog(Login, "Invalid password ! Try again");
				
			}
			
		}
		else {
			
			JOptionPane.showMessageDialog(Login, "Invalid Login ! Try again");
			
		}

	}
}
