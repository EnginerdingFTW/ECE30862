import java.util.Timer;
import javax.swing.ImageIcon;


public class Amunition {

	public boolean canShoot = true;
	private static float FIRE_RATE = 1.25f;
	private Sprite ammo;
	private Animation anim;
	
	public Amunition(float fire_rate)
	{
		this.FIRE_RATE = fire_rate;
		String filename = "images/amunition.png";
		Animation an = new Animation();
		an.addFrame(new ImageIcon(filename).getImage(), 10);
		//ammo = new Sprite(an);
		
	}
	
	public void shooting(boolean dir)
	{
    	Timer timer = new Timer();
    	if (canShoot)
    	{
    		canShoot = false;
    		timer.schedule(new FireRound(), 0);
    	}	
	 }
	
	private void spawnInstance()
	{
		
	}
	
	
    private class FireRound extends java.util.TimerTask
    {
	    public void run()
	    {
	    	System.out.println("I'M FIRING MY LASER! RAWRRRRRRRR");
	    	//create ammo with velocity
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
