
public class maing {
	
	 public static void main(String[] arguments) {
         MainFrame frame = new MainFrame();
         Model m = new Model();
         Controller c = new Controller(frame, m);
         frame.setVisible(true);

 }

}
