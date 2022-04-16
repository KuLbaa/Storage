package Projekt;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ShowStorageItemFrame extends JFrame {
	ArrayList<Storage> JcomboStorages;
	static String s;
	static Storage PickedStorage;
	
	public ShowStorageItemFrame() {
		
		super("Pick Storage to show...");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(215, 220); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		
		JcomboStorages = MainFrame.GetStorages();
		
		String[] StorageList = new String[JcomboStorages.size()];
		for(int j = 0; j<JcomboStorages.size(); j++) {
			
			String k = MainFrame.GetStorages().get(j).toString();
			StorageList[j] = k;
		}
		
		JComboBox comboBoxStorages = new JComboBox<>(StorageList);
		comboBoxStorages.setBounds(10, 123, 180, 22);
		getContentPane().add(comboBoxStorages);
		
		JButton PickButton = new JButton("Pick");
		PickButton.setBounds(70, 157, 60, 23);
		getContentPane().add(PickButton);
		
		JLabel lblNewLabel = new JLabel("Pick storage to show ");
		lblNewLabel.setBounds(45, 98, 110, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\The-Simpsons-Logo-icon.png"));
		lblNewLabel_1.setBounds(38, 11, 189, 98);
		getContentPane().add(lblNewLabel_1);
		
		PickButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				System.out.println("***");
				s = comboBoxStorages.getSelectedItem().toString();
				for(Storage i: JcomboStorages) {

					if(i.toString().equals(s)) {
						
						PickedStorage = i;
						
					}
					
				}

						System.out.println(PickedStorage+"**");
						ItemsInStorageFrame IIS = new ItemsInStorageFrame();
						setVisible(false);
					
					
				
				
			}
		});
	}
	
	public static String GetStorageLocation() {
		
		return s;
		
	}
	
	public static Storage GetPickedStorage() {
		
		return PickedStorage;
		
	}
}
