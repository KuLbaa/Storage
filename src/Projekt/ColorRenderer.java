package Projekt;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorRenderer extends DefaultTableCellRenderer{
	
	Color backgroundColor;
	
	public ColorRenderer(Color backgroundColor) {
											
		this.backgroundColor = backgroundColor;
	
	}
	
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,   boolean hasFocus, int row, int column) {

		//setBackground(Color.RED);
			

		
	      return this;
	}
}
