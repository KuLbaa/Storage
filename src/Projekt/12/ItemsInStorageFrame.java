package Projekt;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class ItemsInStorageFrame extends JFrame {
	String StorageName;
	Storage s;
	
	public ItemsInStorageFrame() {
		
		super("Items...");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(215, 220); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		s = ShowStorageItemFrame.GetPickedStorage();
		System.out.println(s);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 66, 189, 114);
		getContentPane().add(textArea);
		System.out.println(s.GetObjects().toString());
		textArea.setText(s.GetObjects().toString());
		
		StorageName = ShowStorageItemFrame.GetStorageLocation();
		
		JLabel lblNewLabel = new JLabel(StorageName);
		lblNewLabel.setBounds(5, 11, 200, 14);
		getContentPane().add(lblNewLabel);
		setLocationRelativeTo(null);
	}
}
