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

        Title_Image title_Image = new Title_Image();
        addObject(title_Image,258,169);
        StartImage startImage = new StartImage();
        addObject(startImage,285,340);
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
