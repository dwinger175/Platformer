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
    
      /**
     * 
     * Changes world if Duke is touching the Fish
     */
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
         else if(numWorld == 3)
         {
             Greenfoot.setWorld(new Level4());
              Level3 Level3 = (Level3) getWorld();
             Level3.stop();
         }
         else if(numWorld == 4)
         {
             Greenfoot.setWorld(new Level5());
              Level4 Level4 = (Level4) getWorld();
             Level4.stop();
         }
         else if(numWorld == 5)
         {
             Greenfoot.setWorld(new Level6());
              Level5 Level5 = (Level5) getWorld();
             Level5.stop();
         }
         else if(numWorld == 6)
         {
             Greenfoot.setWorld(new End());
              Level6 Level6 = (Level6) getWorld();
             Level6.stop();
         }
     }
        
        
    }
    }
    
    
    

