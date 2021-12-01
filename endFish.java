import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endFish extends Actor
{
    public int numWorld = 1;
    public String worldName;
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
        if (isTouching(Duke.class)){
            numWorld++;
        }
       
       
        
        
        
        
    }
    public void moveWorld(){
        if (numWorld == 2)
        {
            Greenfoot.setWorld(new Level2());
            
        }
        
        
    }
    
    
}
