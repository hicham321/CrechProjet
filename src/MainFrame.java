import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainFrame extends JFrame {
	
	JPanel cards ;
	
	mainPanel card1 = new mainPanel();
	
	ViewAjoutEmp card2= new ViewAjoutEmp();
	
	ViewAjoutEnf card3= new ViewAjoutEnf();
	
	
	public MainFrame(){
		
        setResizable(true);
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cards = new JPanel(new CardLayout());
        
        cards.add(card1, "Card 1");
        cards.add(card2, "Card 2");
        cards.add(card3, "Card 3");
        
        getContentPane().add(cards); 
	
	}
	

}
