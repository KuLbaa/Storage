package Projekt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ObjectToStorageFrame extends JFrame{
	ArrayList<MyObject> JcomboObjects;
	ArrayList<MyObject> JcomboStorages;
	String ItemcomboBox;
	Storage PickedStorage;
	MyObject PickedObject;
	
	public ObjectToStorageFrame() {
		super("Adding item to storage..");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		setSize(205, 220); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		Font font = new Font("SanSerif", Font.BOLD, 25);
		
		JLabel ItemText = new JLabel("Item:");
		ItemText.setBounds(45, 90, 65, 25);
		getContentPane().add(ItemText);
		ItemText.setFont(font);
		
		
		JcomboObjects = MainFrame.GetAllObject();
		JcomboStorages = MainFrame.GetStorages();
		System.out.println(JcomboStorages+"****");
		

		String[] ObjectList = new String[JcomboObjects.size()];
		for(int j = 0; j<JcomboObjects.size(); j++) {
			
			String k = JcomboObjects.get(j).toString();
			ObjectList[j] = k;
		}
		
		JComboBox ItemcomboBox = new JComboBox<>(ObjectList);
		ItemcomboBox.setBounds(110, 91, 80, 22);
		getContentPane().add(ItemcomboBox);
		
		String[] StorageList = new String[JcomboStorages.size()];
		for(int l = 0; l<JcomboStorages.size(); l++) {
			String p = MainFrame.GetStorages().get(l).toString();
			StorageList[l] = p;
		}
		
		JComboBox StoragecomboBox = new JComboBox<>(StorageList);
		StoragecomboBox.setBounds(110, 127, 80, 22);
		getContentPane().add(StoragecomboBox);
		
		JLabel StorageText = new JLabel("Storage:");
		StorageText.setBounds(3, 120, 100, 33);
		getContentPane().add(StorageText);
		StorageText.setFont(font);
		
		
		
		JButton AddButton = new JButton("Add");
		AddButton.setBounds(60, 156, 89, 23);
		getContentPane().add(AddButton);
		ImageIcon img = new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png");
		setIconImage(img.getImage());
		setLocationRelativeTo(null);
		
		AddButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				for(Storage i: MainFrame.Storages) {
					
					if(i.toString().equals(StoragecomboBox.getSelectedItem().toString())) {
						
						PickedStorage = i;
						
					}
					
				}
				for(MyObject i: MainFrame.AllObject) {
					
					if(i.toString().equals(ItemcomboBox.getSelectedItem().toString())) {
						
						PickedObject = i;
						
					}
					
				}
				
				
				if(PickedStorage.area > PickedObject.size) {
				PickedStorage.Objects.add(PickedObject);
				PickedStorage.area -= PickedObject.size;
				JOptionPane.showMessageDialog(ItemText, "Object was sucessfully added !");
				setVisible(false);
				}
				else{
					
					JOptionPane.showMessageDialog(ItemText, "Can't add object. Not enough space !");
					
				}
			}
		});
	}
}
