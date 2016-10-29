import java.awt.*;

public class ScoreKeep{
	
	public static String Score;
	private ScoreDrawer ScrDraw = new ScoreDrawer();
	
	public ScoreKeep()
	{
		Score = "0";
		ScrDraw.draw("0");
	}
	
	public void IncreaseScore()
	{
		Score = Integer.toString(Integer.parseInt(Score) + 1);
		ScrDraw.draw(Score);
	}
	
}
