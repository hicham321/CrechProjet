import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;


public class Controller {
	
	private MainFrame frame = new MainFrame();
	
	private Model model = new  Model();
	
 public Controller(MainFrame frame, Model model){
	 
	 this.frame= frame;
	 
	 this.model= model;
	 
	 this.frame.AddMainFrameAactionlistner(new MainFrameAactionlistner());
	 
 }
 class MainFrameAactionlistner implements ActionListener {
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource()==frame.getButButton()){
			CardLayout cardLayout = (CardLayout) frame.cards.getLayout();
			cardLayout.show(frame.cards, "Card 2");
		}
		
	} 
 }
}
