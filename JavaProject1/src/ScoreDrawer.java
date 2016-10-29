import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ScoreDrawer extends JPanel {

	String score;
	public void paint(Graphics g) {
	    Dimension d = this.getPreferredSize();
	    int fontSize = 60;
	
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
	     
	    g.setColor(Color.black);
	    
	    g.drawString(this.score, 30, 50);
	}

	public void draw(String currscore) {
	  	this.score = currscore;
	    JFrame frame = new JFrame();
	    frame.getContentPane().add(new ScoreDrawer());
	
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(900,400);
	    frame.setUndecorated(true);
	    frame.setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
	    frame.toFront();
	    frame.setVisible(true);
   
	}
}