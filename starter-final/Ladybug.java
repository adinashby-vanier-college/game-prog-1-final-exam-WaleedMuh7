// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        /* */
        moveAndTurn();
        Arrive();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * This method allows te player to move thel adybug, with the arrowkeys.
     */
    public void moveAndTurn()
    {
        move(0);
        if (Greenfoot.isKeyDown("left")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("up")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("down")) {
            turn(-3);
        }
    }

    /**
     * when the ladybug arrrives on the finishLine, this methode removes the finish line. 
     */
    public void Arrive()
    {
        Actor FinishLocation = getOneIntersectingObject(FinishLocation.class);
        if (FinishLocation != null) {
            World world = getWorld();
            world.removeObject(FinishLocation);
        }
    }

    /**
     * When the finish line is removed this method ends the game and the game is won else the game continues.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * When the public boolean isGameWon returns true this methods allows the transition to the game won world.
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  GameWonWorld();
        Greenfoot.setWorld(gameWonWorld);
    }
}
