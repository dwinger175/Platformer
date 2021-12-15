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
    
    private GreenfootSound music = new GreenfootSound("Battle_of_Chiptune.mp3");        
   
    public void act()
    {
        playMusic();

    }
    
    /**
     * PLays Music when the level starts
     * 
     */
     public void playMusic()
    {
        music.playLoop(); 
      
    }
    
    /**
     * Creates items when world is created
     * 
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

        Floater floater = new Floater();
        addObject(floater,708,125);
        floater.setLocation(648,112);

        healthbar = new HealthBars(2);
        addObject(healthbar,70,31);

        EndFish endFish = new EndFish(2);
        addObject(endFish,651,66);
        Duke duke = new Duke(26, 508, 2);
        addObject(duke,26,508);
        OffGrounds offGrounds = new OffGrounds();
        addObject(offGrounds,418,505);
        SmolOff smolOff = new SmolOff();
        addObject(smolOff,583,478);
        SmolOff smolOff2 = new SmolOff();
        addObject(smolOff2,698,442);

        SmolOff smolOff3 = new SmolOff();
        addObject(smolOff3,773,369);
        smolOff3.setLocation(778,367);
        SmolOff smolOff4 = new SmolOff();
        addObject(smolOff4,674,310);
        OffGrounds offGrounds2 = new OffGrounds();
        addObject(offGrounds2,508,259);
        OffGrounds offGrounds3 = new OffGrounds();
        addObject(offGrounds3,309,211);
        SmolOff smolOff5 = new SmolOff();
        addObject(smolOff5,475,145);
    }
    
    /**
     * Activates healthbar damage
     * 
     */
    public void damage()
    {
              healthbar.checkDamage();
            }    
    
            
    /**
     * Stops music when called
     * 
     */public void stop()
    {
        music.stop();
            
    }
  
    }

