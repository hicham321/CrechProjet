import java.awt.Panel;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ViewAjoutEnf extends JPanel {
	
	private JLabel AjoutEnf = new JLabel("Ajout� Un Enfant");
	
	private JButton Ok = new JButton();
	
	private JButton Annuler = new JButton();
	
	
	
	public ViewAjoutEnf (){
		
		
		
		this.add(this.AjoutEnf);
		this.add(this.Ok);
		add(this.Annuler);
	
		
		
	}

}
