import java.util.Timer;

import javax.swing.ImageIcon;


public class Amunition {

	public boolean canShoot = true;
	private boolean dir = false;
	private boolean lastDir = true;
	private static float FIRE_RATE = 1.5f;
	private static float FIRE_VEL = 2.0f;
	private Sprite ammo;
	private static TileMap tilemap;
	private String filename = "images/amunition.png";
	public boolean playerOwned = false;
	
	public Amunition(float fire_rate)
	{
		this.FIRE_RATE = fire_rate;	
	}
	
	public static void SetMap(TileMap tile)
	{
		tilemap = tile;
	}
	
	
	public void shooting(Sprite sprite)
	{
		lastDir = dir;
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
		Animation an = new Animation();
		an.addFrame(new ImageIcon(filename).getImage(), 10);
		an.addFrame(new ImageIcon(filename).getImage(), 10);
		boolean owned = false;
		if (sprite instanceof Player)
		{
			owned = true;
		}
		ammo = new FiredShot(an, owned);

		dir = sprite.getDirection();
		
		if (dir == true)
		{
			ammo.setVelocityX(FIRE_VEL);
		}
		else
		{
			ammo.setVelocityX(-FIRE_VEL);
		}
		int temp = -100;
		if (ammo.getVelocityX() > 0)
		{
			temp = -temp;
		}
		ammo.setX(sprite.getX());
		ammo.setY(sprite.getY() + 50);
		
		tilemap.addSprite(ammo);
		
	}
	
	
    private class FireRound extends java.util.TimerTask
    {
	    public void run()
	    {
//	    	System.out.println("I'M FIRING MY LASER! RAWRRRRRRRR");
	    	try
	    	{
	    		Thread.sleep((long) FIRE_RATE * 1000);
	    	}
	    	catch (Exception e)
	    	{
	    		System.out.println("ERROR");
	    	}
//	    	System.out.println("make it to the end...?");
	    	canShoot = true;
	    	
	    }
    }
	
	
}
