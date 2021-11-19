import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class start extends Actor
{
    private int counter;
    
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        startLevel();
    }
    
    
   
    
    public void startLevel()
    {
        if (Greenfoot.isKeyDown("enter") == true)
        {
            if (++counter == 5) Greenfoot.setWorld(new MyWorld());
            
            
            
        }
        
    }
    
    
}
