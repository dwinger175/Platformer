import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartImage extends Actor
{
    

    
    /**
     * Act - do whatever the start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        startLevel();
    }

     /**
     * 
     * If player presses enter, Change to MyWorld
     */
    public void startLevel()
    {
        if (Greenfoot.isKeyDown("enter") == true)
        {
            Greenfoot.setWorld(new MyWorld());

            
        }

    }

}
