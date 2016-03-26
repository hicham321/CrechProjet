import java.awt.Panel;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ViewAjoutEnf extends JFrame {
	
	private JLabel AjoutEnf = new JLabel("Ajouté Un Enfant");
	
	private JButton Ok = new JButton();
	
	private JButton Annuler = new JButton();
	
	
	
	public ViewAjoutEnf (){
		
		
		Panel p = new Panel();
		
		p.add(this.AjoutEnf);
		p.add(this.Ok);
		p.add(this.Annuler);
	
		
		
	}

}
