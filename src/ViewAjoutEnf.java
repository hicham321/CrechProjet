import java.awt.Panel;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ViewAjoutEnf extends JPanel {
	
	private JLabel AjoutEnf = new JLabel("Ajout� Un Enfant");
	
	private JButton Ok = new JButton();
	
	private JButton Annuler = new JButton();
	
	private menubar menub = new menubar();
	
	public ViewAjoutEnf (){
		
		this.add(menub);
		this.setLayout(null);
		this.add(this.AjoutEnf);
		this.add(this.Ok);
		this.add(this.Annuler);
	
		
		
	}

}
