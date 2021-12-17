import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{
     private GreenfootSound music = new GreenfootSound("Restart.mp3");    
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
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
        EndImage endImage = new EndImage();
        addObject(endImage,365,61);
        Credits credits = new Credits();
        addObject(credits,417,507);
        Title_Image title_Image = new Title_Image();
        addObject(title_Image,356,230);
        BackButton backButton = new BackButton();
        addObject(backButton,64,107);
    }

     /**
     * Plays music until enter is pressed
     * 
     */
    public void playMusic()
    {
        music.playLoop(); 
        if (Greenfoot.isKeyDown("space") == true)
        {
           music.stop();
        }
    }
}
