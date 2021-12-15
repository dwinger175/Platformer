import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreens extends World
{
     private GreenfootSound music = new GreenfootSound("Restart.mp3");    
    int counter = 0;
    /**
     * Constructor for objects of class StartScreens.
     * 
     */
    public StartScreens()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Activates when started
     * 
     */
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

        StartImage startImage = new StartImage();
        addObject(startImage,397,494);
        Title_Image title_Image = new Title_Image();
        addObject(title_Image,382,259);
    }

    /**
     * Plays music until enter is pressed
     * 
     */
    public void playMusic()
    {
        music.playLoop(); 
        if (Greenfoot.isKeyDown("enter") == true)
        {
           music.stop();
        }
    }
}
