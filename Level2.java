import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private healthBar healthbar;
    private Duke duke;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    int numLives = 3;

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,15,577);

        Platform platform2 = new Platform();
        addObject(platform2,15,555);
        Spike spike = new Spike();
        addObject(spike,379,583);
        Spike spike2 = new Spike();
        addObject(spike2,506,582);
        Spike spike3 = new Spike();
        addObject(spike3,632,582);
        Spike spike4 = new Spike();
        addObject(spike4,760,582);
        offground offground = new offground();
        addObject(offground,458,482);
        offground offground2 = new offground();
        addObject(offground2,684,430);
        offground offground3 = new offground();
        addObject(offground3,459,357);
        offground offground4 = new offground();
        addObject(offground4,660,266);
        Duke duke = new Duke(70,509);
        addObject(duke,70,509);
        offground offground5 = new offground();
        addObject(offground5,432,212);
        Floater floater = new Floater();
        addObject(floater,708,125);
        floater.setLocation(648,112);
        endFish endFish = new endFish(1);
        addObject(endFish,645,63);
        healthbar = new healthBar();
        addObject(healthbar,70,31);

    }

    public void damage()
    {
        numLives--;
        healthbar.checkDamage();
    }    

  
    }

