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
	
	JMenu menuemp = new JMenu("Employ�");
	
	public MainFrame(){
		
        setSize(400,400);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMain = new JPanel();
        panelMain.setLayout(null);
        
        panelMain.add(but);
        but.setBounds(70,70,70,70);
        
        panelMain.add(menubar);
        menubar.setBounds(0, 0, 400, 30);
        //
        //menuenf.setVisible(true);
        menuenf.add("home");
        menuenf.add("about");
        menuenf.add("explore");
        
        menubar.add(menuenf);
       
        panelMain.setBackground(Color.white);
        panelMain.setBounds(0, 0, 400, 400);
       
        add(panelMain);
		
	}

}
