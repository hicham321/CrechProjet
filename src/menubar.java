import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menubar extends JMenuBar {
	
    JMenu menuouvrir = new JMenu("Fichier");
	
	JMenuItem ajoutbase = new JMenuItem("Ouvrir");
	
	JMenuItem quiter = new JMenuItem("Quitter");
	
	JMenuItem motpass = new JMenuItem("Changer le mot de passe");

	JMenu menuenf = new JMenu("Enfant");
	
	JMenuItem ajoutEnf = new JMenuItem("Ajout Enf");
	
	JMenuItem listeEnf = new JMenuItem("Liste Enf");

	JMenuItem explore = new JMenuItem("explore");
	
	JMenu menuemp = new JMenu("Employ�");
	
     JMenuItem ajoutemp = new JMenuItem("Ajout Emp");
	
	JMenuItem listeEmp = new JMenuItem("Liste Emp");
	
	JMenu menuapropos = new JMenu("A Propos");
	
	public menubar(){
		
		    this.setBounds(0, 0, 900, 30);
	        
	        menuouvrir.add(ajoutbase);
	        menuouvrir.add(motpass);
	        menuouvrir.addSeparator();
	        menuouvrir.add(quiter);
	        
	        
	        menuenf.add(ajoutEnf);
	        menuenf.add(listeEnf);
	        menuenf.add(explore);
	        
	        menuemp.add(ajoutemp);
	        menuemp.add(listeEmp);
	       
	        this.add(menuouvrir);
	        this.add(menuenf);
	        this.add(menuemp);
	        this.add(menuapropos);
		
	}
	
    public void AddMenuBarAactionlistner (ActionListener listner ){
		
		this.ajoutbase.addActionListener(listner);
		this.ajoutemp.addActionListener(listner);
		this.ajoutEnf.addActionListener(listner);
		this.explore.addActionListener(listner);
		this.listeEmp.addActionListener(listner);
		this.listeEnf.addActionListener(listner);
		this.menuapropos.addActionListener(listner);
		
	}
    public JMenuItem getMenuempItem(){
 	   return this.ajoutemp;
    }
	
	

}
