import java.awt.*;

public class ScoreKeep{
	
	public static String Score;
	
	
	public ScoreKeep()
	{
		Score = "0";
	}
	
	public void IncreaseScore()
	{
		Score = Integer.toString(Integer.parseInt(Score) + 1);
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Font font = new Font("Serif", Font.PLAIN, 96);
		g2.setFont(font);
		g.drawString(Score, 40, 40);
	}
}
