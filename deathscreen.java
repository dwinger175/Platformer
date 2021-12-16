import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deathscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deathscreen extends World
{
    private GreenfootSound music = new GreenfootSound("Game_Over.mp3");    
    /**
     * Constructor for objects of class Deathscreen.
     * 
     */
    public Deathscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        GameOver gameOver = new GameOver(1);
        addObject(gameOver,414,205);
    }
     /**
     * 
     * Activates when started
     */
    public void act()
    {
        playMusic();

    }
  
    /**
     * 
     * Plays Music
     */
    public void playMusic()
    {
        music.playLoop(); 

    }

    /**
     * stops Music
     * 
     */
    public void stop()
    {
        music.stop();

    }
}
