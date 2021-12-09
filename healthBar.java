import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBar extends Actor
{
   
    private GreenfootImage heart3 = new GreenfootImage("Fullhearts.png");    
    private GreenfootImage heart2 = new GreenfootImage("2hearts.png");  
    private GreenfootImage heart1 = new GreenfootImage("1hearts.png"); 
    int totalHealth = 3;
    
    /**
     * Act - do whatever the healthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    public void checkDamage()
    {
        totalHealth--;
        update();
        
    }
    public void update()
    {
        if (totalHealth == 1)
        {
            setImage(heart1);
            
            
        }
        if (totalHealth == 2)
        {
            setImage(heart2);
            
            
        }
        if (totalHealth == 3)
        {
            setImage(heart3);
            
            
        }
        if (totalHealth == 0)
        {
            Greenfoot.setWorld(new deathscreen());
            
        }
        
    }
    
}
