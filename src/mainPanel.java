import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class mainPanel extends JPanel {
	
    JMenuBar menubar = new JMenuBar();
	
	JButton but = new JButton("sdf");
	
	JMenu menuouvrir = new JMenu("Base");
	
	JMenuItem ajoutbase = new JMenuItem("Ouvrir");
	
	JMenu menuenf = new JMenu("Enfant");
	
	JMenuItem ajoutEnf = new JMenuItem("Ajout Enf");
	
	JMenuItem listeEnf = new JMenuItem("Liste Enf");

	JMenuItem explore = new JMenuItem("explore");
	
	JMenu menuemp = new JMenu("Employ�");
	
     JMenuItem ajoutemp = new JMenuItem("Ajout Emp");
	
	JMenuItem listeEmp = new JMenuItem("Liste Emp");
	
	public mainPanel(){
		
		//modify this when changing to a different layout manager
		    this.setLayout(null);
		    
		    this.add(but);
		    
	        but.setBounds(70,70,70,70);
	        
	        this.add(menubar);
	        menubar.setBounds(0, 0, 400, 30);
	        
	        menuouvrir.add(ajoutbase);
	        
	        menuenf.add(ajoutEnf);
	        menuenf.add(listeEnf);
	        menuenf.add(explore);
	        
	        menuemp.add(ajoutemp);
	        menuemp.add(listeEmp);
	        
	        menubar.add(menuouvrir);
	        menubar.add(menuenf);
	        menubar.add(menuemp);
	       
	        this.setBackground(Color.white);
	        this.setBounds(0, 0, 400, 400);
		
		
	}


}