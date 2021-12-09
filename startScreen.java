import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{
    private GreenfootSound music = new GreenfootSound("Restart.mp3");    
    int counter = 0;
    /**
     * Constructor for objects of class startScreen.
     * 
     */
    public startScreen()
    {   

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    public void act()
    {
        playMusic();

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        title_Screen title_Screen = new title_Screen();
        addObject(title_Screen,269,146);
        start start = new start();
        addObject(start,304,338);
    }

    public void playMusic()
    {
        music.playLoop(); 
        if (Greenfoot.isKeyDown("enter") == true)
        {
           music.stop();
        }
    }
}



