import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndFish extends Actor
{
    int numWorld;
    public EndFish(int worldNum){
        numWorld = worldNum;
        
    }
    
    
    /**
     * Act - do whatever the EndFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        nextWorld();
    }
    
    
    public void nextWorld(){
        
     if(isTouching (Duke.class))
     {
         if(numWorld == 1)
         {
             Greenfoot.setWorld(new Level2());
              MyWorld MyWorld= (MyWorld) getWorld();
             MyWorld.stop();
         }
         else if(numWorld == 2)
         {
             Greenfoot.setWorld(new Level3());
              Level2 Level2= (Level2) getWorld();
             Level2.stop();
         }
     }
        
        
    }
    }
    
    
    

