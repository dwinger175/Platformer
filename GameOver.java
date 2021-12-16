import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    
    int numWorld;
    public GameOver(int worldNum){
        numWorld = worldNum;
        
    }
    
    
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        restart();
    }
    
      /**
     * 
     * If player presses enter, change it my World
     */
    public void restart()
    {
         
        if (numWorld == 1)
        {
        if (Greenfoot.isKeyDown("enter") == true)
        {
            Greenfoot.setWorld(new MyWorld());
            
            Deathscreen Deathscreen= (Deathscreen) getWorld();
             Deathscreen.stop();
            
        }
    }
     if (numWorld == 2)
        {
        if (Greenfoot.isKeyDown("enter") == true)
        {
            Greenfoot.setWorld(new Level4());
            DeathWorld2 Deathscreen= (DeathWorld2) getWorld();
             Deathscreen.stop();
            
            
        }
    }
    
    
    
    
    
    
    }
}
