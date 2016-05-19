import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//class for registration 

public class Register extends JFrame{
	
	//ok annuler utilisateur mot pass 
	JButton ok = new JButton("Ok");
	
	JButton annule = new JButton("Annuler");
	
	JLabel bienvenu= new JLabel("Bienvenu!");
	
	JLabel saisielabel= new JLabel("Saisie le nom d'utilisateur et son mot de passe");
	
	JLabel utilisateurlab = new JLabel("Utilisateur");
	
	JLabel motpasslab = new JLabel("Utilisateur");
	
	public Register(){
		setResizable(true);
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
