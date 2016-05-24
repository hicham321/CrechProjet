import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;


public class Controller {
	
	private MainFrame frame = new MainFrame();
	
	private Register register = new Register();
	
	private Model model = new  Model();
	
 public Controller(MainFrame frame,Register register, Model model){
	 
	 this.frame= frame;
	 
	 this.register = register;
	 
	 this.model= model;
	 
	 this.frame.AddMainFrameAactionlistner(new MainFrameAactionlistner());
	 
	 this.register.AddRegisterActionlistner(new RegisterActionListner());
 }
 class MainFrameAactionlistner implements ActionListener {
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//dummy condition
		if(arg0.getSource()==frame.getButButton()){
			
		} 
		
		//clicking Emp menu
		if(arg0.getSource()==frame.getMenuempItem()){
			CardLayout cardLayout = (CardLayout) frame.cards.getLayout();
			cardLayout.show(frame.cards, "Card 2");	
		}
		
	} 
 }
 
 class RegisterActionListner implements ActionListener{
	 @Override
	public void actionPerformed(ActionEvent arg0) {
		 
		 if(arg0.getSource()== register.getOk()){
			 
			boolean thereispass= model.checkdatabase();
			if(thereispass){
				
					//select the
				
				
			}
			else{
				//do something if there is no password
			}
		 }
		
	}
 }
}
