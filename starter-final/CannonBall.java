// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        collision();
        if (isGameLost()) {
            transitionToGameLostWorld();
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * This method allows the CannonBall to "kill" or remove the Ladybug when it collides with the ladybug.
     */
    public void collision()
    {
        Actor ladybug = getOneIntersectingObject(Ladybug.class);
        if (ladybug != null) {
            World world = getWorld();
            world.removeObject(ladybug);
        }
    }

    /**
     * while the ladybug is "alive" this methode allows the game to continue else when the ladybug is no more it stops the game.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method transitions to Game lost world when the public boolean isGameLost returns true.
     */
    final public void transitionToGameLostWorld()
    {
        World gameLostWorld =  new  GameLostWorld();
        Greenfoot.setWorld(gameLostWorld);
    }
}
