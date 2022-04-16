package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

public class NewObjectFrame extends JFrame {
	private JTextField NameField;
	private JTextField SizeField;
	private JTextField DescriptionField;
	String nameField, descriptionField;
	int sizeField;

	
	public NewObjectFrame() {
		
		super("Create item...");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(200, 300); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		ImageIcon img = new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png");
		setIconImage(img.getImage());
		
		Font font = new Font("SanSerif", Font.BOLD, 25);
		Font font1 = new Font("SanSerif", Font.BOLD, 15);
		
		JLabel Icon = new JLabel("");
		Icon.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png"));
		Icon.setBounds(22, 0, 141, 139);
		getContentPane().add(Icon);
		
		NameField = new JTextField();
		NameField.setBackground(new Color(0, 128, 0));
		NameField.setBounds(85, 147, 86, 20);
		NameField.setForeground(Color.WHITE);
		NameField.setFont(font1);
		getContentPane().add(NameField);
		NameField.setColumns(10);
		
		SizeField = new JTextField();
		SizeField.setBackground(new Color(0, 128, 0));
		SizeField.setBounds(85, 176, 86, 20);
		SizeField.setForeground(Color.WHITE);
		SizeField.setFont(font1);
		getContentPane().add(SizeField);
		SizeField.setColumns(10);
		
		JLabel NameText = new JLabel("Name:");
		NameText.setBounds(5, 145, 74, 20);
		NameText.setFont(font);
		NameText.setForeground(Color.WHITE);
		getContentPane().add(NameText);
		
		JLabel SizeText = new JLabel("Size:");
		SizeText.setBounds(20, 175, 74, 20);
		getContentPane().add(SizeText);
		SizeText.setForeground(Color.WHITE);
		SizeText.setFont(font);
		
		JButton CreateButton = new JButton("Create");
		CreateButton.setForeground(new Color(0, 0, 0));
		CreateButton.setBackground(new Color(0, 128, 0));
		CreateButton.setBounds(100, 232, 89, 23);
		getContentPane().add(CreateButton);
		
		JLabel CreateItemField = new JLabel("Create item");
		CreateItemField.setBounds(55, 130, 86, 14);
		CreateItemField.setFont(font1);
		CreateItemField.setForeground(Color.WHITE);
		getContentPane().add(CreateItemField);
		
		DescriptionField = new JTextField();
		DescriptionField.setBounds(85, 205, 86, 20);
		getContentPane().add(DescriptionField);
		DescriptionField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Description:");
		lblNewLabel_4.setBounds(22, 206, 46, 14);
		getContentPane().add(lblNewLabel_4);
		setLocationRelativeTo(null);
		
		CreateButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				nameField = NameField.getText();
				sizeField = Integer.parseInt(SizeField.getText());
				descriptionField = DescriptionField.getText();
				MyObject NewObject = new MyObject(nameField, sizeField, descriptionField);
				System.out.println(NewObject);
				MainFrame.GetAllObject().add(NewObject);
				System.out.println(MainFrame.GetAllObject());
				setVisible(false);
			}
		});
		
	}
}
