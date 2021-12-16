import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{
    private GreenfootSound music = new GreenfootSound("Moving_Up.mp3");  
    private HealthBars healthbar;
    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
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
        addObject(platform,90,578);
        Platform platform2 = new Platform();
        addObject(platform2,673,578);

        Arrow arrow = new Arrow();
        addObject(arrow,761,477);
        Arrow arrow2 = new Arrow();
        addObject(arrow2,761,456);
        Arrow arrow3 = new Arrow();
        addObject(arrow3,762,429);
        Arrow arrow4 = new Arrow();
        addObject(arrow4,759,404);
        Arrow arrow5 = new Arrow();
        addObject(arrow5,758,383);
        Arrow arrow6 = new Arrow();
        addObject(arrow6,758,363);
        Arrow arrow7 = new Arrow();
        addObject(arrow7,753,345);

        Arrow arrow8 = new Arrow();
        addObject(arrow8,711,471);
        Arrow arrow9 = new Arrow();
        addObject(arrow9,707,446);
        Arrow arrow10 = new Arrow();
        addObject(arrow10,709,424);
        Arrow arrow11 = new Arrow();
        addObject(arrow11,705,402);
        Arrow arrow12 = new Arrow();
        addObject(arrow12,705,376);
        Arrow arrow13 = new Arrow();
        addObject(arrow13,704,360);
        Arrow arrow14 = new Arrow();
        addObject(arrow14,705,334);
        SmallGround smallGround = new SmallGround();
        addObject(smallGround,122,545);
        SmallGround smallGround2 = new SmallGround();
        addObject(smallGround2,122,502);
        SmallGround smallGround3 = new SmallGround();
        addObject(smallGround3,296,546);
        SmallGround smallGround4 = new SmallGround();
        addObject(smallGround4,296,503);
        SmallGround smallGround5 = new SmallGround();
        addObject(smallGround5,395,546);
        SmallGround smallGround6 = new SmallGround();
        addObject(smallGround6,395,503);
        SmallGround smallGround7 = new SmallGround();
        addObject(smallGround7,573,547);
        SmallGround smallGround8 = new SmallGround();
        addObject(smallGround8,573,506);
        SmallGround smallGround9 = new SmallGround();
        addObject(smallGround9,673,546);
        SmallGround smallGround10 = new SmallGround();
        addObject(smallGround10,673,507);
        SmallGround smallGround11 = new SmallGround();
        addObject(smallGround11,771,545);
        SmallGround smallGround12 = new SmallGround();
        addObject(smallGround12,771,507);
        Duke duke = new Duke(37, 534, 6);
        addObject(duke,37,534);
        EndFish endFish = new EndFish(6);
        addObject(endFish,739,465);
        Arrow arrow15 = new Arrow();
        addObject(arrow15,652,464);
        Arrow arrow16 = new Arrow();
        addObject(arrow16,650,442);
        Arrow arrow17 = new Arrow();
        addObject(arrow17,651,422);
        Arrow arrow18 = new Arrow();
        addObject(arrow18,650,402);
        Arrow arrow19 = new Arrow();
        addObject(arrow19,651,379);
        Arrow arrow20 = new Arrow();
        addObject(arrow20,653,356);
        Arrow arrow21 = new Arrow();
        addObject(arrow21,654,335);
         healthbar = new HealthBars(4);
        addObject(healthbar,70,31);
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
}
