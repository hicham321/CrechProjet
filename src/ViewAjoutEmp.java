import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// interface pour Employe
public class ViewAjoutEmp extends JPanel {

	private JLabel AjoutEmp = new JLabel("Ajout� Un Employ�");
	
	private JButton Ok = new JButton();
	
	private JButton Annuler = new JButton();
	
	
	
	public ViewAjoutEmp (){
		
		add(this.AjoutEmp);
		add(this.Ok);
		add(this.Annuler);
			
	}

}
