import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MainFrame extends JFrame {
	
	JPanel cards = new JPanel();
	
	mainPanel card1 = new mainPanel();
	
	ViewAjoutEmp card2= new ViewAjoutEmp();
	
	ViewAjoutEnf card3= new ViewAjoutEnf();
	
	
	public MainFrame(){
		
        //CardLayout mainLayout = new CardLayout();
        setResizable(true);
        //setLayout(mainLayout);
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cards.add(card1, "Card 1");
        cards.add(card2, "Card 2");
        cards.add(card3, "Card 3");
		
	}
	
		
	

}
