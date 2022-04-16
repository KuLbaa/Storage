package Projekt;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;

public class ShowAllObjectsFrame extends JFrame{
	DefaultListModel<MyObject> model = new DefaultListModel<>();
	JList<MyObject> ObjectList = new JList<>();
	JTextPane Text = new JTextPane();
	JSplitPane splitPane = new JSplitPane();
	JScrollPane ObjectScroll = new JScrollPane(ObjectList);
	JScrollPane TextScroll = new JScrollPane(Text);
	
	public ShowAllObjectsFrame() {
		super("Items and their descriptions");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		pack();
		setSize(400, 200); 
		setResizable(false);
		getContentPane().setBackground(Color.DARK_GRAY);
		setLocationRelativeTo(null);
		
		TextScroll.getVerticalScrollBar().setBackground(Color.LIGHT_GRAY);
		TextScroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		    @Override
		    protected void configureScrollBarColors() {
		        this.thumbColor = Color.ORANGE;
		    }
		});
		
		ObjectScroll.getVerticalScrollBar().setBackground(Color.LIGHT_GRAY);
		ObjectScroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		    @Override
		    protected void configureScrollBarColors() {
		        this.thumbColor = Color.ORANGE;
		    }
		});

		ObjectList.setModel(model);
		
		for(MyObject i: MainFrame.AllObject) {
			
			model.addElement(i);
			
		}
		ObjectList.getSelectionModel().addListSelectionListener(e -> {
			
			MyObject o = ObjectList.getSelectedValue();
			Text.setText(o.description);
			
		});
		splitPane.setUI(new BasicSplitPaneUI() 
		{
		    @Override
		    public BasicSplitPaneDivider createDefaultDivider() 
		    {
		        return new BasicSplitPaneDivider(this) 
		        {                
		            public void setBorder(Border b) {}

		            @Override
		            public void paint(Graphics g) 
		            {
		                g.setColor(Color.ORANGE);
		                g.fillRect(0, 0, getSize().width, getSize().height);
		                super.paint(g);
		            }
		        };
		    }
		});
		
		splitPane.setLeftComponent(ObjectScroll);
		splitPane.setRightComponent(TextScroll);
		Text.setBackground(Color.DARK_GRAY);
		Text.setForeground(Color.WHITE);
		this.validate();
		ObjectList.setBackground(Color.DARK_GRAY);
		ObjectList.setForeground(Color.WHITE);
		//splitPane.setRightComponent(Text);
		getContentPane().add(splitPane);

	}
}
