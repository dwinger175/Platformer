import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private GreenfootSound music = new GreenfootSound("Battle_of_Chiptune.mp3");    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground(new GreenfootImage("Background.png"));
        prepare();
    }
  
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Platform platform2 = new Platform();
        addObject(platform2,566,574);
        Structure structure = new Structure();
        addObject(structure,173,517);
        Structure structure2 = new Structure();
        addObject(structure2,274,517);

        Structure structure3 = new Structure();
        addObject(structure3,388,517);
        Structure structure4 = new Structure();
        addObject(structure4,494,516);

        Structure structure6 = new Structure();
        addObject(structure6,493,454);
        OffGrounds OffGrounds2 = new OffGrounds();
        addObject(OffGrounds2,434,414);

        OffGrounds OffGrounds3 = new OffGrounds();
        addObject(OffGrounds3,623,372);

        OffGrounds OffGrounds4 = new OffGrounds();
        addObject(OffGrounds4,793,320);

        OffGrounds OffGrounds6 = new OffGrounds();
        addObject(OffGrounds6,431,171);
        Duke duke = new Duke(34,526,1);
        addObject(duke,34,526);
        Floater floater = new Floater();
        addObject(floater,219,178);

        HealthBars HealthBars = new HealthBars(1);
        addObject(HealthBars,87,45);
        EndFish endFish = new EndFish(1);
        addObject(endFish,218,130);
        Platform platform1 = new Platform();
        addObject(platform1,19,575);

        OffGrounds offGrounds6 = new OffGrounds();
        addObject(offGrounds6,218,478);
        SmolOff smolOff = new SmolOff();
        addObject(smolOff,258,450);

        Structure structure7 = new Structure();
        addObject(structure7,562,517);

        Structure structure16 = new Structure();
        addObject(structure16,563,324);
        Structure structure17 = new Structure();
        addObject(structure17,564,278);

        OffGrounds offGrounds8 = new OffGrounds();
        addObject(offGrounds8,592,234);
        Structure structure28 = new Structure();
        addObject(structure28,743,458);
        Structure structure29 = new Structure();
        addObject(structure29,742,405);
        Structure structure35 = new Structure();
        addObject(structure35,743,362);

        structure16.setLocation(496,452);
        Structure structure12 = new Structure();
        addObject(structure12,387,459);
        Structure structure13 = new Structure();
        addObject(structure13,562,455);
        Structure structure14 = new Structure();
        addObject(structure14,561,418);
        Structure structure15 = new Structure();
        addObject(structure15,564,322);
        Structure structure40 = new Structure();
        addObject(structure40,677,518);
        Structure structure41 = new Structure();
        addObject(structure41,676,455);
        Structure structure42 = new Structure();
        addObject(structure42,676,418);
        Structure structure19 = new Structure();
        addObject(structure19,652,328);
        Structure structure20 = new Structure();
        addObject(structure20,652,269);
        Structure structure21 = new Structure();
        addObject(structure21,743,519);
        Structure structure22 = new Structure();
        addObject(structure22,483,366);
        Structure structure23 = new Structure();
        addObject(structure23,483,310);
        Structure structure24 = new Structure();
        addObject(structure24,482,250);

        Structure structure25 = new Structure();
        addObject(structure25,480,190);
        Structure structure26 = new Structure();
        addObject(structure26,390,367);
        Structure structure27 = new Structure();
        addObject(structure27,390,310);
        Structure structure43 = new Structure();
        addObject(structure43,388,255);
        Structure structure44 = new Structure();
        addObject(structure44,385,206);
    }
     
    /**
     * Activates when start is pressed
     * 
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
     * 
     * Stops Music
     */
    public void stop()
    {
        music.stop();
            
    }

    
    
 
}
