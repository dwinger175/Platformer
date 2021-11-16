import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Floater extends Platform
{

    private int wait;
    private GreenfootImage image1 = new GreenfootImage("Floater.png");
    private GreenfootImage image2 = new GreenfootImage("floaterAlt.png");
    /**
     * Act - do whatever the Floater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        if (wait == 5) {

            if (getImage() == image1)
            {
                setImage(image2);
                    wait = 0;
            }
            else
            {
                setImage(image1);
                wait = 0;
            }
        }
        else {

            wait++;

            
        }

        
    }
}
