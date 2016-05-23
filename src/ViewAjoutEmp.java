import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// interface pour Employe
public class ViewAjoutEmp extends JPanel {

	private JLabel ajoutEmp = new JLabel("Ajout� Un Employ�");
	
	private JButton ok = new JButton("Ok");
	
	private JButton annuler = new JButton("Annuler");
	
	
	
	public ViewAjoutEmp (){
		
		add(this.ajoutEmp);
		add(this.ok);
		add(this.annuler);
			
	}

}
