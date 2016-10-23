import java.util.Timer;
import javax.swing.ImageIcon;


public class Amunition {

	public boolean canShoot = true;
	private boolean dir = false;
	private static float FIRE_RATE = 1.25f;
	private static float FIRE_VEL = 2.0f;
	private Sprite ammo;
	private Animation anim;
	private static TileMap tilemap;
	
	public Amunition(float fire_rate)
	{
		this.FIRE_RATE = fire_rate;
		String filename = "images/amunition.png";
		Animation an = new Animation();
		an.addFrame(new ImageIcon(filename).getImage(), 10);
		an.addFrame(new ImageIcon(filename).getImage(), 10);
		//ammo = new Sprite(an);
		
	}
	
	public static void SetMap(TileMap tile)
	{
		tilemap = tile;
	}
	
	
	public void shooting(Sprite sprite)
	{
		if (sprite.getVelocityX() > 0)
		{
			dir = true;
		}
		else
		{
			dir = false;
		}
    	Timer timer = new Timer();
    	if (canShoot)
    	{
    		canShoot = false;
    		timer.schedule(new FireRound(), 0);
    		spawnInstance(sprite);
    	}	
	 }
	
	private void spawnInstance(Sprite sprite)
	{
		ammo = new Sprite(anim);
		ammo.setX(sprite.getX());
		ammo.setY(sprite.getY());
		//tilemap.addSprite(ammo);
		
		if (dir == true)
		{
			ammo.setVelocityX(FIRE_VEL);
		}
		else
		{
			ammo.setVelocityX(FIRE_VEL);
		}
	}
	
	
    private class FireRound extends java.util.TimerTask
    {
	    public void run()
	    {
	    	System.out.println("I'M FIRING MY LASER! RAWRRRRRRRR");
	    	try
	    	{
	    		Thread.sleep((long) FIRE_RATE * 1000);
	    	}
	    	catch (Exception e)
	    	{
	    		
	    	}
	    	canShoot = true;
	    	
	    }
    }
	
	
}
