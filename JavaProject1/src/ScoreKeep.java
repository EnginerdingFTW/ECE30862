import java.awt.*;

public class ScoreKeep{
	
	public static String Score;
	
	public ScoreKeep()
	{
		Score = "0";
	}
	
	public void IncreaseScore()
	{
		Score = Integer.toString(Integer.parseInt(Score) + 100);
	}
	
}
