import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import java.awt.CardLayout;


public class Controller {
	
	private MainFrame frame = new MainFrame();
	
	private Register register = new Register();
	
	private Model model = new  Model();
	
	private menubar menubar = new menubar();
	
 public Controller(MainFrame frame,Register register, Model model){
	 
	 this.frame= frame;
	 
	 this.register = register;
	 
	 this.model= model;
	 
	 this.frame.AddMainFrameAactionlistner(new MainFrameAactionlistner());
	 
	 this.register.AddRegisterActionlistner(new RegisterActionListner());
	 
	 this.menubar.AddMenuBarAactionlistner( new MenuBarAactionlistner() );
	 
 }
 class MainFrameAactionlistner implements ActionListener {
	 
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//dummy condition
		if(arg0.getSource()==frame.getButButton()){
			
		} 
		
		//clicking Emp menu
		
		
	} 
 }
 
 class RegisterActionListner implements ActionListener{
	 @Override
	public void actionPerformed(ActionEvent arg0) {
		 
		 if(arg0.getSource()== register.getOk()){
			 try{
			     model.connectio("jdbc:ucanaccess://C:/Users/pc4u/Desktop/Base de données1.accdb");
			     System.out.println("the pass is executed");
			     boolean thereispass= model.checkdatabase();
			     System.out.println("the pass is executed");
			     if(thereispass){
				    if((model.passdatabase().equals(register.getPassText()))&(model.usernamedatabase().equals(register.getUtilisateurText()))){
					       register.dispose();
					       frame.dispose();
				    }	
				    else{
				     	JOptionPane.showMessageDialog(null, "Mot de pass ou nom d'utilisateur incorrect");
				    }
				
			     }
			     else{
				   //do something if there is no password
				    JOptionPane.showMessageDialog(null, "Crie un a utilisateur et un mot de passe");
			     }
		     }catch(Exception e){
				     e.printStackTrace();
		      }
		}
		 if(arg0.getSource()== register.getAnnule()){
			 
			 register.dispose();
			 frame.setEnabled(true);
		 }
		
	}
 }
 class MenuBarAactionlistner implements ActionListener{
	 
	 @Override
	public void actionPerformed(ActionEvent arg0) {
		 if(arg0.getSource()==menubar.getMenuempItem()){
				CardLayout cardLayout = (CardLayout) frame.cards.getLayout();
				cardLayout.show(frame.cards, "Card 2");	
			}		
	}
 }
 
}
