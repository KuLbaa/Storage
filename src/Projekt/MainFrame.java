package Projekt;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;

public class MainFrame extends JFrame {
	
	static ArrayList<Storage> Storages;
	static ArrayList<MyObject> AllObject;
	
	public MainFrame() {
	super("The Simpsons");
	
	Storages = new ArrayList<Storage>();
	AllObject = new ArrayList<MyObject>();
	
	Color color = new Color(186, 54, 45);
	
	   try {
	         FileInputStream fileInStorage = new FileInputStream("D:\\eclipse-workspace\\ProjektGUI_2\\DataBaseStorage.ser");
	         FileInputStream fileInObject = new FileInputStream("D:\\eclipse-workspace\\ProjektGUI_2\\DataBaseObject.ser");
	         ObjectInputStream inStorage = new ObjectInputStream(fileInStorage);
	         ObjectInputStream inObject = new ObjectInputStream(fileInStorage);
	         Storages = (ArrayList<Storage>) inStorage.readObject();
	         AllObject = (ArrayList<MyObject>) inObject.readObject();
	         inStorage.close();
	         inObject.close();
	         fileInStorage.close();
	         fileInObject.close();
	      } catch (IOException i) {
	         i.printStackTrace();
	         return;
	      } catch (ClassNotFoundException c) {
	         c.printStackTrace();
	         return;
	      }
	
	
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setVisible(true);
	getContentPane().setLayout(null);
	setSize(1280, 720); 
	setResizable(false);
	getContentPane().setBackground(Color.DARK_GRAY);
	setLocationRelativeTo(null);	
	ImageIcon img = new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png");
	setIconImage(img.getImage());
	
	JButton AddNewStorageButton = new JButton("");
	AddNewStorageButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Data-Upload-icon.png"));
	AddNewStorageButton.setOpaque(true);
	AddNewStorageButton.setBounds(39, 22, 200, 120);
	AddNewStorageButton.setBackground(color);
	AddNewStorageButton.setBorder(new LineBorder(Color.BLACK));
	getContentPane().add(AddNewStorageButton);
	
	JButton AddNewItemButton = new JButton("");
	AddNewItemButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Add-icon.png"));
	AddNewItemButton.setBounds(39, 153, 200, 120);
	AddNewItemButton.setBackground(color);
	AddNewItemButton.setBorder(new LineBorder(Color.BLACK));
	getContentPane().add(AddNewItemButton);
	
	JButton AddItemtoStorageButton = new JButton("");
	AddItemtoStorageButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Add-Basket-icon.png"));
	AddItemtoStorageButton.setBounds(39, 282, 200, 120);
	AddItemtoStorageButton.setBackground(color);
	AddItemtoStorageButton.setBorder(new LineBorder(Color.BLACK));
	getContentPane().add(AddItemtoStorageButton);
	
	JButton SaveButton = new JButton("");
	SaveButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Disk-icon.png"));
	SaveButton.setBounds(39, 544, 200, 120);
	SaveButton.setBackground(color);
	SaveButton.setBorder(new LineBorder(Color.BLACK));
	getContentPane().add(SaveButton);
	
	JButton btnNewButton = new JButton("");
	btnNewButton.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Bar-Chart-5-icon.png"));
	btnNewButton.setBackground(color);
	btnNewButton.setBorder(new LineBorder(Color.BLACK));

	btnNewButton.setBounds(39, 413, 200, 120);
	getContentPane().add(btnNewButton);
	
	JButton ShowAllStorages = new JButton("");
	ShowAllStorages.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\output-onlinepngtools.png"));
	ShowAllStorages.setBounds(396, 355, 370, 300);
	ShowAllStorages.setBackground(color);
	getContentPane().add(ShowAllStorages);
	
	JButton ShowAllItems = new JButton("");
	ShowAllItems.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\output-onlinepngtools1.png"));
	ShowAllItems.setBounds(883, 355, 370, 300);
	ShowAllItems.setBackground(color);
	getContentPane().add(ShowAllItems);
	
	JLabel IconLabel = new JLabel("");
	IconLabel.setIcon(new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\pngguru.com (2).png"));
	IconLabel.setBounds(500, 22, 631, 300);
	getContentPane().add(IconLabel);
	
	AddNewItemButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			NewObjectFrame NOF = new NewObjectFrame();
			
		}
	});
	
	AddNewStorageButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			NewStorageFrame NSF = new NewStorageFrame();
			
		}
	});
	
	AddItemtoStorageButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ObjectToStorageFrame OTSF = new ObjectToStorageFrame();
			
		}
	});
	
	SaveButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			  try {
			         FileOutputStream fileOutStorages =
			         new FileOutputStream("D:\\eclipse-workspace\\ProjektGUI_2\\DataBaseStorage.ser");
			         FileOutputStream fileOutObjects =
					         new FileOutputStream("D:\\eclipse-workspace\\ProjektGUI_2\\DataBaseObject.ser");
			         ObjectOutputStream outStorage = new ObjectOutputStream(fileOutStorages);
			         ObjectOutputStream outObject = new ObjectOutputStream(fileOutStorages);
			         outStorage.writeObject(Storages);
			         outObject.writeObject(AllObject);
			         outStorage.close();
			         outObject.close();
			         fileOutStorages.close();
			         fileOutObjects.close();
			         JOptionPane.showMessageDialog(IconLabel, "You sucessfully saved data !");
			      } catch (IOException i) {
			         i.printStackTrace();
			      }
			
		}
	});
	
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ShowStorageItemFrame SSIF = new ShowStorageItemFrame();
			System.out.println("HEY");
		}
	});
	
	ShowAllItems.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ShowAllObjectsFrame m = new ShowAllObjectsFrame();
			
		}
	});
	
	ShowAllStorages.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AllStoragesWithCapacityFrame ASWCF = new AllStoragesWithCapacityFrame();
			
		}
	});
	
	
	
	}
	
	public static ArrayList GetAllObject() {
		
		return AllObject;
		
	}
	
	public static ArrayList GetStorages() {
		
		return Storages;
		
	}
}
