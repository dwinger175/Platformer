import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private HealthBars healthbar;
    private Duke Duke;
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
    private GreenfootSound music = new GreenfootSound("Battle_of_Chiptune.mp3");        
   
    public void act()
    {
        playMusic();

    }
     public void playMusic()
    {
        music.playLoop(); 
      
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        music.playLoop();

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
        OffGround OffGround = new OffGround();
        addObject(OffGround,458,482);
        OffGround OffGround2 = new OffGround();
        addObject(OffGround2,684,430);
        OffGround OffGround3 = new OffGround();
        addObject(OffGround3,459,357);
        OffGround OffGround4 = new OffGround();
        addObject(OffGround4,660,266);
        Duke duke = new Duke(70,509,2);
        addObject(duke,70,509);
        OffGround OffGround5 = new OffGround();
        addObject(OffGround5,432,212);
        Floater floater = new Floater();
        addObject(floater,708,125);
        floater.setLocation(648,112);

        healthbar = new HealthBars(2);
        addObject(healthbar,70,31);

        EndFish endFish = new EndFish(2);
        addObject(endFish,651,66);
    }

    public void damage()
    {
        numLives--;
        healthbar.checkDamage();
            }    
    public void stop()
    {
        music.stop();
            
    }
  
    }

