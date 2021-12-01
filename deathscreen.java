import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deathscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class deathscreen extends World
{
    private GreenfootSound music = new GreenfootSound("Game_Over.mp3");   
    /**
     * Constructor for objects of class deathscreen.
     * 
     */
    public deathscreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        playMusic();
        save();
    }
    
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameOver gameOver = new GameOver();
        addObject(gameOver,312,134);
    }
    public void playMusic()
    {
        music.playLoop(); 
        if (Greenfoot.isKeyDown("enter") == true)
        {
          music.stop();
        }
    }

    public void save() 
    {
               if (Greenfoot.isKeyDown("enter") == true)
        {
          Greenfoot.setWorld(new MyWorld());
        }
        
        
        
    }


}

