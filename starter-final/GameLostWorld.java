// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameLostWorld extends World
{

    /**
     * Constructor for objects of class GameLostWorld.
     */
    public GameLostWorld()
    {
        super(560, 560, 1);
        showText("Game Over !", 260, 260);
    }

    /**
     * This method allows a text to be displayed in with a big black font.
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString("You lose", x, y);
    }
}
