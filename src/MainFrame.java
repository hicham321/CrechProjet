import java.awt.CardLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
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
	
	public void AddMainFrameAactionlistner (ActionListener listner ){
		
		this.card1.but.addActionListener(listner);
		
		
	}
	
	
	//card1 components getters and setters
	public JButton getButButton (){
		
		return this.card1.but;
	}
	
   
	
	//card2 components
	
	
	//card3 components
	

}
