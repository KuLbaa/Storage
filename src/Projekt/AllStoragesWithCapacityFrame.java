package Projekt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class AllStoragesWithCapacityFrame extends JFrame{
	
	private MyTable tableModel;
	private JTable table;
	private ArrayList<Storage> storagelist;
	

	
	public AllStoragesWithCapacityFrame() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(new FlowLayout());
		setSize(505, 320); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		
		
		
		storagelist = MainFrame.Storages;
		tableModel = new MyTable(storagelist);
		table = new JTable(tableModel);
		JScrollPane scrollPane = new JScrollPane(table);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(scrollPane);
		
		TableColumn tColumn = table.getColumnModel().getColumn(1);
		tColumn.setCellEditor(new DefaultCellEditor(MyTable.label));
		MyTable.label.setBackground(Color.RED);
		MyTable.label.setOpaque(true);

		getContentPane().add(panel);
		setLocationRelativeTo(null);
		
		
	}

}
