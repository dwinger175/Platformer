import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        restart();
      
    }
    
      /**
     * 
     * If player presses enter, change it World to start Screens
     */
    public void restart()
    {
        if (Greenfoot.isKeyDown("space") == true)
        {
            Greenfoot.setWorld(new StartScreens());
            
     
            
        }
        
    }
}
