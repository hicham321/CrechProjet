import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class mainPanel extends JPanel {
	
    menubar menubar= new menubar();	
    
	JButton but = new JButton("sdf");
	
	

	
	public mainPanel(){
		
		//modify this when changing to a different layout manager
		    this.setLayout(null);
		    
		    this.add(but);
		    
	        but.setBounds(70,70,70,70);
	        
	        this.add(menubar);
	       
	       
	        this.setBackground(Color.white);
	        this.setBounds(0, 0, 400, 400);
	        this.setVisible(true);
		
		
	}


}
