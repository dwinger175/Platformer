import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{
         private HealthBars healthBars;
    private GreenfootSound music = new GreenfootSound("Moving_Up.mp3");    
    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SmallGround smallGround = new SmallGround();
        addObject(smallGround,48,575);
        SmallGround smallGround2 = new SmallGround();
        addObject(smallGround2,48,533);
        SmallGround smallGround3 = new SmallGround();
        addObject(smallGround3,48,490);
        Spike spike = new Spike();
        addObject(spike,162,582);
        Spike spike2 = new Spike();
        addObject(spike2,289,582);
        Spike spike3 = new Spike();
        addObject(spike3,417,582);
        Spike spike4 = new Spike();
        addObject(spike4,544,582);
        Spike spike5 = new Spike();
        addObject(spike5,672,582);
        Spike spike6 = new Spike();
        addObject(spike6,793,582);
        SmolOff smolOff = new SmolOff();
        addObject(smolOff,220,549);
        Duke duke = new Duke(44, 443, 5);
        addObject(duke,44,443);
        Arrow arrow = new Arrow();
        addObject(arrow,564,512);
        OffGrounds offGrounds = new OffGrounds();
        addObject(offGrounds,379,474);
        OffGrounds offGrounds2 = new OffGrounds();
        addObject(offGrounds2,546,432);
        Arrow arrow2 = new Arrow();
        addObject(arrow2,782,399);
        OffGrounds offGrounds3 = new OffGrounds();
        addObject(offGrounds3,709,432);
        SmolOff smolOff2 = new SmolOff();
        addObject(smolOff2,625,348);
        SmolOff smolOff3 = new SmolOff();
        addObject(smolOff3,542,323);
        SmolOff smolOff4 = new SmolOff();
        addObject(smolOff4,543,353);
        SmolOff smolOff5 = new SmolOff();
        addObject(smolOff5,460,323);
        SmolOff smolOff6 = new SmolOff();
        addObject(smolOff6,459,295);
        OffGrounds offGrounds4 = new OffGrounds();
        addObject(offGrounds4,341,298);
        OffGrounds offGrounds5 = new OffGrounds();
        addObject(offGrounds5,201,298);
        Arrow arrow3 = new Arrow();
        addObject(arrow3,761,251);
        Arrow arrow4 = new Arrow();
        addObject(arrow4,703,248);
        Floater floater = new Floater();
        addObject(floater,64,273);
        EndFish endFish = new EndFish(5);
        addObject(endFish,61,225);
        healthBars = new HealthBars(5);
        addObject(healthBars,70,31);
    }
    
    /**
     * 
     * Activates when started
     */
    public void act()
    {
        playMusic();

    }

    /**
     * 
     * Plays Music
     */
    public void playMusic()
    {
        music.playLoop(); 

    }

    /**
     * stops Music
     * 
     */
    public void stop()
    {
        music.stop();

    }

    /**
     * 
     * Calls Healthbar
     */
    public void damage()
    {

        healthBars.checkDamage();
    }    

    
    
    
}
