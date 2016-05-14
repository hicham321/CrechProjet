import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	JMenuBar menubar = new JMenuBar();
	
	JButton but = new JButton("sdf");
	
	JMenu menuenf = new JMenu("Enfant");
	
	JMenu menuemp = new JMenu("Employé");
	
	public MainFrame(){
		// setting up JFrame
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // creating main JPanel (white)
        JPanel panelMain = new JPanel();
        //panelMain.setLayout(new BorderLayout());
        this.getContentPane().setLayout(null);

        panelMain.add(but);
        but.setBounds(70,70,70,70);
        
        menubar.setEnabled(true);
        this.menubar.add(menuenf);
        panelMain.add(menubar, BorderLayout.NORTH);
        panelMain.setBackground(Color.gray);
        panelMain.setBounds(0, 0, 400, 400);
       
        panelMain.setPreferredSize(new Dimension(200, 40));
        add(panelMain);
		
	}

}
