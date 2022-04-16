package Projekt;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class main {

	public static void main(String[] args) {
			
			LoginFrame LF = new LoginFrame();
			ImageIcon img = new ImageIcon("D:\\eclipse-workspace\\ProjektGUI_2\\img\\Homer-Simpson-05-The-Incredible-Homer-icon.png");
			LF.setIconImage(img.getImage());
			System.out.println(MainFrame.GetAllObject());
			System.out.println(MainFrame.GetStorages());
			//MainFrame.GetStorages().add(120, "Poland");
			//System.out.println(MainFrame.GetStorages().get(0).toString());
			//ShowStorageItemFrame n = new ShowStorageItemFrame();
			//ShowAllObjectsFrame m = new ShowAllObjectsFrame();

	}

}
