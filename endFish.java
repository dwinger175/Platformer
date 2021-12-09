import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endFish extends Actor
{
    public int numWorld;
    
    
    
    
     /**
     *  Initialize variables upon placement in the world
     * 
     */
    
    public endFish(int worldNum)
    {
        numWorld = worldNum;
        
        
    }
    
    
    
    
    
    
    
    /**
     * Act - do whatever the endFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkworld();
        moveWorld();
        
    }
    
    public void checkworld()
    {
      
        
        
        
        
    }
    public void moveWorld(){
        if(isTouching (Duke.class))
        {
        
        
         if (numWorld == 1)
        {
            Greenfoot.setWorld(new Level2());
            
        }
        
        
        if (numWorld == 2)
        {
            Greenfoot.setWorld(new Level2());
            
        }
    }
        
    }
    
    
}
