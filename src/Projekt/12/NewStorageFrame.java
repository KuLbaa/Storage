package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class NewStorageFrame extends JFrame {
	private JTextField StorageSizeField;
	int StorageSize;
	String LocationTextF;
	private JTextField LocationField;
		
	public NewStorageFrame() {
		
		super("Create storage...");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(205, 220); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		ImageIcon img = new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png");
		setIconImage(img.getImage());
		setLocationRelativeTo(null);
		
		Font font = new Font("SanSerif", Font.BOLD, 15);
		
		JLabel StorageSizeText = new JLabel("Storage Size:");
		StorageSizeText.setBounds(0, 125, 95, 19);
		getContentPane().add(StorageSizeText);
		StorageSizeText.setFont(font);
		StorageSizeText.setForeground(Color.WHITE);
		
		StorageSizeField = new JTextField();
		StorageSizeField.setBounds(98, 126, 86, 21);
		getContentPane().add(StorageSizeField);
		StorageSizeField.setColumns(10);
		StorageSizeField.setBackground(Color.LIGHT_GRAY);
		StorageSizeField.setFont(font);
		StorageSizeField.setBorder(new LineBorder(Color.WHITE));
		
		JButton CreateButton = new JButton("Create");
		CreateButton.setBounds(45, 155, 89, 23);
		getContentPane().add(CreateButton);
		CreateButton.setFont(font);
		CreateButton.setBackground(Color.YELLOW);
		
		JLabel LocationText = new JLabel("Location:");
		LocationText.setBounds(30, 93, 85, 20);
		getContentPane().add(LocationText);
		LocationText.setFont(font);
		LocationText.setForeground(Color.WHITE);
		
		LocationField = new JTextField();
		LocationField.setBounds(98, 94, 86, 20);
		getContentPane().add(LocationField);
		LocationField.setColumns(10);
		LocationField.setFont(font);
		LocationField.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\The-Simpsons-02-icon.png"));
		lblNewLabel.setBounds(27, 0, 194, 113);
		getContentPane().add(lblNewLabel);
		
		CreateButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				StorageSize = Integer.parseInt(StorageSizeField.getText());
				LocationTextF = LocationField.getText();
				Storage NewStorage = new Storage(StorageSize, LocationTextF);
				System.out.println(NewStorage);
				MainFrame.GetStorages().add(NewStorage);
				System.out.println(MainFrame.GetStorages());
				setVisible(false);
			}
		});
	}
}
