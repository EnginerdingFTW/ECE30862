import java.util.Timer;
/**
    The Player.
*/
public class Player extends Creature {

    private static final float JUMP_SPEED = -.95f;
    private static final float FIRE_RATE = 1.25f;
    
    private Amunition ammo = new Amunition(FIRE_RATE);
    private boolean onGround;

    public Player(Animation left, Animation right,
        Animation deadLeft, Animation deadRight)
    {
        super(left, right, deadLeft, deadRight);
        
    }


    public void collideHorizontal() {
        setVelocityX(0);
    }


    public void collideVertical() {
        // check if collided with ground
        if (getVelocityY() > 0) {
            onGround = true;
        }
        setVelocityY(0);
    }


    public void setY(float y) {
        // check if falling
        if (Math.round(y) > Math.round(getY())) {
            onGround = false;
        }
        super.setY(y);
    }


    public void wakeUp() {
        // do nothing
    }


    /**
        Makes the player jump if the player is on the ground or
        if forceJump is true.
    */
    public void jump(boolean forceJump) {
        if (onGround || forceJump) {
            onGround = false;
            setVelocityY(JUMP_SPEED);
        }
    }
    
    public void shooting(){
    	ammo.shooting(this);
    }
    


    public float getMaxSpeed() {
        return 0.5f;
    }

}