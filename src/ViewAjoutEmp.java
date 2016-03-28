import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;

// interface pour Employe
public class ViewAjoutEmp {

	private JLabel AjoutEmp = new JLabel("Ajouté Un Employé");
	
	private JButton Ok = new JButton();
	
	private JButton Annuler = new JButton();
	
	
	
	public ViewAjoutEmp (){
		
		
		Panel p = new Panel();
		
		p.add(this.AjoutEmp);
		p.add(this.Ok);
		p.add(this.Annuler);
	
		
		
	}

}
