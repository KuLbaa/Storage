package Projekt;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

public class MyTable extends AbstractTableModel {
	
	ArrayList<Storage> myList;
	String columnNames[] = { "Storage Location", "Capacity", "Capacity in %" };
	int column = 0;
	int row = 0;
	static JTextField label = new JTextField();
	
	
	 
	public MyTable(ArrayList<Storage> storagelist) {
		
		myList = storagelist;
		
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		 int size;
	      if (myList == null) {
	         size = 0;
	      }
	      else {
	         size = myList.size();
	      }
	      return size;
	}
	

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		Object temp = null;
	      if (column == 0) {
	         temp = myList.get(row).toString();
	      }
	      else if (column == 1) {
	        temp = label;
	      }
	      else if (column == 2) {
	         temp = new Double(myList.get(row).GetFreeCapacity())+"%";
	      }
	      return temp;
	}
	
	 public String getColumnName(int column) {
	        return columnNames[column];
	    }
	 
	 

}
