import java.awt.*;

public class ScoreKeep{
	
	public static String Score;
	private ScoreDrawer ScrDraw = new ScoreDrawer();
	
	public ScoreKeep()
	{
		Score = "1";
		ScrDraw.draw();
	}
	
	public void IncreaseScore()
	{
		Score = Integer.toString(Integer.parseInt(Score) + 1);
		ScrDraw.draw();
	}
	
}
