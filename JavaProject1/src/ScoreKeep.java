
public class ScoreKeep{
	
	public int Score;
	public Player CurrPlayer;
	
	
	public ScoreKeep(Player p1)
	{
		Score = 0;
		CurrPlayer = p1;
	}
	
	public void UpdateScore(Creature npc)
	{
		if(npc.getState() == Creature.STATE_DYING)
		{
			Score+=1;
		}
		
	}

}
