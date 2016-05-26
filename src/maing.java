import jdk.nashorn.internal.runtime.regexp.joni.constants.RegexState;


public class maing {
	
	 public static void main(String[] arguments) {
         MainFrame frame = new MainFrame();
         Register register= new Register();
         Model m = new Model();
         Controller c = new Controller(frame,register, m);
         frame.setVisible(true);
         register.setVisible(true);
         frame.setEnabled(false);

 }

}
