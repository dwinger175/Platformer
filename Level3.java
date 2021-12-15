import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    private Duke Duke;
  
    
    private HealthBars healthbar;
    
    private GreenfootSound music = new GreenfootSound("Battle_of_Chiptune.mp3");    
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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
        Platform platform = new Platform();

        SmallGround smallGround = new SmallGround();
        addObject(smallGround,27,574);
        SmallGround smallGround2 = new SmallGround();
        addObject(smallGround2,27,531);
        SmallGround smallGround3 = new SmallGround();
        addObject(smallGround3,27,491);

        SmallGround smallGround4 = new SmallGround();
        addObject(smallGround4,27,450);
        SmallGround smallGround5 = new SmallGround();
        addObject(smallGround5,27,412);
        SmallGround smallGround6 = new SmallGround();
        addObject(smallGround6,27,372);
        SmallGround smallGround7 = new SmallGround();
        addObject(smallGround7,27,337);

        SmallGround smallGround8 = new SmallGround();
        addObject(smallGround8,27,298);
        SmallGround smallGround9 = new SmallGround();
        addObject(smallGround9,27,259);
        SmallGround smallGround10 = new SmallGround();
        addObject(smallGround10,27,219);
        SmallGround smallGround11 = new SmallGround();
        addObject(smallGround11,27,183);

        Duke duke = new Duke(34, 137,3);
        addObject(duke,34,137);
        SmallGround smallGround12 = new SmallGround();
        addObject(smallGround12,753,575);
        SmallGround smallGround13 = new SmallGround();
        addObject(smallGround13,753,534);
        SmallGround smallGround14 = new SmallGround();
        addObject(smallGround14,753,497);
        SmallGround smallGround15 = new SmallGround();
        addObject(smallGround15,753,482);
        SmallGround smallGround16 = new SmallGround();
        addObject(smallGround16,753,457);
        SmallGround smallGround17 = new SmallGround();
        addObject(smallGround17,753,435);
        SmallGround smallGround18 = new SmallGround();
        addObject(smallGround18,753,402);
        SmallGround smallGround19 = new SmallGround();
        addObject(smallGround19,753,367);
        SmallGround smallGround20 = new SmallGround();
        addObject(smallGround20,753,340);
        SmallGround smallGround21 = new SmallGround();
        addObject(smallGround21,753,302);
        SmallGround smallGround22 = new SmallGround();
        addObject(smallGround22,753,274);
        SmallGround smallGround23 = new SmallGround();
        addObject(smallGround23,753,251);
        SmallGround smallGround24 = new SmallGround();
        addObject(smallGround24,753,228);
        SmallGround smallGround25 = new SmallGround();
        addObject(smallGround25,753,213);
        SmallGround smallGround26 = new SmallGround();
        addObject(smallGround26,753,179);

        healthbar = new HealthBars(3);
        addObject(healthbar,70,31);

        Spike spike = new Spike();
        addObject(spike,142,582);
        Spike spike2 = new Spike();
        addObject(spike2,270,582);
        Spike spike3 = new Spike();
        addObject(spike3,397,582);
        Spike spike4 = new Spike();
        addObject(spike4,525,582);
        Spike spike5 = new Spike();
        addObject(spike5,654,582);

        Spike spike6 = new Spike();
        addObject(spike6,781,582);

        Spike spike7 = new Spike();
        addObject(spike7,12,583);
        ;
        SmolOff smolOff = new SmolOff();
        addObject(smolOff,279,523);
        SmolOff smolOff2 = new SmolOff();
        addObject(smolOff2,448,459);
        SmolOff smolOff3 = new SmolOff();
        addObject(smolOff3,553,417);
        OffGrounds offground = new OffGrounds();
        addObject(offground,401,327);
        SmolOff smolOff4 = new SmolOff();
        addObject(smolOff4,546,240);
        EndFish endFish = new EndFish(3);
        addObject(endFish,751,133);
        SmolOff smolOff5 = new SmolOff();
        addObject(smolOff5,654,182);
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
    
    
    
}
