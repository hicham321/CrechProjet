import javax.swing.UIManager;

import jdk.nashorn.internal.runtime.regexp.joni.constants.RegexState;


public class maing {
	
	 public static void main(String[] arguments) {
		 try { 
			    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e) {
			    e.printStackTrace();
			}
		
         MainFrame frame = new MainFrame();
         Register register= new Register();
         Model m = new Model();
         Controller c = new Controller(frame,register, m);
         frame.setVisible(true);
         register.setVisible(true);
         frame.setEnabled(false);

 }

}
