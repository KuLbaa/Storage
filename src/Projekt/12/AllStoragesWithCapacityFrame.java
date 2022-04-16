package Projekt;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllStoragesWithCapacityFrame extends JFrame{
	JTable table;
	Object[] ColumnNames;
	Object[]data;
	String s;
	int count = 0;
	JScrollPane scrollPane;
	public AllStoragesWithCapacityFrame() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(new FlowLayout());
		setSize(505, 320); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		table.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {

	            },
	            new String [] {
	            	"Storage Location", "Capacity", "Capacity in %"
	            }
	        ));
		scrollPane.setViewportView(table);
		
		
		
		//Object[] ColumnNames = {"Storage Location", "Capacity", "Capacity in %"};
		
		DefaultTableModel model = AddRowToTable();
//		for(Storage i: MainFrame.Storages) {
//					
//					
//					s = i.location;
//					System.out.println(s);
//					table.setValueAt(i, count, 0);
//					data[count][1]= (i.area/i.BaseArea)*100+"%";
//					data[count][2] = (i.area/i.BaseArea)*100+"%";
//					count++;
//		}
//		System.out.println(data);
				
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);
		setLocationRelativeTo(null);
		
		
		
	}
	private DefaultTableModel AddRowToTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		ArrayList<Storage> list = MainFrame.Storages;
		
		data = new Object[3];
		
		for(int i=0; i<list.size(); i++) {
			
			data[0] = list.get(i).location;
			data[2] = (list.get(i).area)/(list.get(i).BaseArea)*100+"%";
			if(list.get(i).area == list.get(i).BaseArea) {
				
				data[1] = "green";
				
			}
			if(list.get(i).area<(list.get(i).BaseArea/2)) {
				
				data[1] = "yellow";
				
			}
			else {
				
				data[1] = "red";
				
			}
			model.addRow(data);
		}
		return model;
	}
}
