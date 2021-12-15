import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private Duke Duke;

    private HealthBars healthbar;
    private GreenfootSound music = new GreenfootSound("Moving_Up.mp3");    
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
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

        healthbar.checkDamage();
    }    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform();
        addObject(platform,190,578);
        Platform platform2 = new Platform();
        addObject(platform2,594,578);
        Arrow arrow = new Arrow();
        addObject(arrow,770,537);

        healthbar = new HealthBars(4);
        addObject(healthbar,70,31);
        SmallGround smallGround = new SmallGround();
        addObject(smallGround,46,546);
        SmallGround smallGround2 = new SmallGround();
        addObject(smallGround2,46,503);
        Duke duke = new Duke(44, 456, 4);
        addObject(duke,44,456);
        SmolOff smolOff = new SmolOff();
        addObject(smolOff,205,478);
        SmolOff smolOff2 = new SmolOff();
        addObject(smolOff2,358,413);

        Arrow arrow2 = new Arrow();
        addObject(arrow2,765,383);
        SmolOff smolOff3 = new SmolOff();
        addObject(smolOff3,484,359);

        OffGrounds offGrounds = new OffGrounds();
        addObject(offGrounds,608,325);
        OffGrounds offGrounds2 = new OffGrounds();
        addObject(offGrounds2,771,325);
        Arrow arrow3 = new Arrow();
        addObject(arrow3,72,295);
        SmolOff smolOff4 = new SmolOff();
        addObject(smolOff4,604,240);
        SmolOff smolOff5 = new SmolOff();
        addObject(smolOff5,485,208);
        Floater floater = new Floater();
        addObject(floater,360,206);
        EndFish endFish = new EndFish(4);
        addObject(endFish,360,156);
    }
}
