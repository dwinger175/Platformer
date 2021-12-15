import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Spike
{
    
    
    private int speed = 5;
    private int counter = 0;
    /**
     * Act - do whatever the Arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fly();
    }
    
    
    
    /**
     * 
     * Moves object from right to left, Reset if hit left wall
     */
    public void fly()
    {
        setLocation (getX() - speed, getY());
        if (getX() == 0)
        {
            reset();
        }
        
        
        
    }
    /**
     * 
     * Move to otherside of level.
     */
    public void reset()
    {
        setLocation(getWorld().getWidth(), getY());
    }
    
    
    
    /**
     * 
     * Reset if touching Player after a second,
     */
    public void checkDuke()
    {
        if(isTouching(Duke.class))
        {
             delayReset();
            
        }
        
    }
     /**
     * 
     * A reset with a delay
     */
    public void delayReset()
    {
        if (counter ==1)
        {
           reset();
           counter = 1;
        }
        else {
            counter++;
        }
    }
}
