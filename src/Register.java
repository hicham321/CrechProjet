import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//class for registration 

public class Register extends JFrame{
	
	//ok annuler utilisateur mot pass 
	private JButton ok = new JButton("Ok");
	
	private JButton annule = new JButton("Annuler");
	
	private JLabel bienvenu= new JLabel("Bienvenu!");
	
	private JLabel saisielabel= new JLabel("Saisie le nom d'utilisateur et son mot de passe");
	
	private JLabel utilisateurlab = new JLabel("Utilisateur");
	
	private JLabel motpasslab = new JLabel("Mot de Passe");
	
	private JTextField utiltext = new JTextField(10);
	
	private JTextField motpasstext = new JTextField(10);
	
	//showing path to the database
	
	private JLabel cheminlab ;
	
	public Register(){
		
		setResizable(true);
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        panel.add(bienvenu);
        panel.add(saisielabel);
        
        panel.add(utilisateurlab);
        panel.add(utiltext);
        
        panel.add(motpasslab);
        panel.add(motpasstext);
        
        panel.add(ok);
        panel.add(annule);
        
        this.add(panel);
        
        this.setVisible(true);
		
	}
	
	public void setCheminLabel (String cheminlabel){
		
		this.cheminlab.setText(cheminlabel);
	}
	public void AddRegisterActionlistner (ActionListener listner ){
		this.ok.addActionListener(listner);
		this.annule.addActionListener(listner);
		
	}

	public JButton getOk() {
		return ok;
	}
	public JButton getAnnule() {
		return annule;
	}

	public void setUtiltext(JTextField utiltext) {
		this.utiltext = utiltext;
	}

	public void setMotpasstext(JTextField motpasstext) {
		this.motpasstext = motpasstext;
	}
	

}
