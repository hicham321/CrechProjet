import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	public MainFrame(){
		// setting up JFrame
        setLayout(null);
        setPreferredSize(new Dimension(420, 90));
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating main JPanel (white)
        JPanel panelMain = new JPanel();
        panelMain.setBackground(Color.WHITE);
        panelMain.setBounds(0, 0, 420, 90);
        panelMain.setPreferredSize(new Dimension(200, 40));
        add(panelMain);
		
	}

}
