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
        music.playLoop();
        Platform platform = new Platform();
        addObject(platform,84,575);
        Platform platform2 = new Platform();
        addObject(platform2,566,574);
        Structure structure = new Structure();
        addObject(structure,173,517);
        Structure structure2 = new Structure();
        addObject(structure2,274,517);
        offground offground = new offground();
        addObject(offground,219,471);
        Structure structure3 = new Structure();
        addObject(structure3,388,517);
        Structure structure4 = new Structure();
        addObject(structure4,494,516);
        Structure structure5 = new Structure();
        addObject(structure5,394,452);
        Structure structure6 = new Structure();
        addObject(structure6,493,454);
        offground offground2 = new offground();
        addObject(offground2,434,414);
        structure5.setLocation(393,466);
        Structure structure7 = new Structure();
        addObject(structure7,574,517);
        Structure structure8 = new Structure();
        addObject(structure8,574,453);
        Structure structure9 = new Structure();
        addObject(structure9,574,403);
        structure5.setLocation(388,455);
        Structure structure10 = new Structure();
        addObject(structure10,672,516);
        Structure structure11 = new Structure();
        addObject(structure11,672,452);
        Structure structure12 = new Structure();
        addObject(structure12,672,406);
        offground offground3 = new offground();
        addObject(offground3,623,372);
        Structure structure13 = new Structure();
        addObject(structure13,753,518);
        Structure structure14 = new Structure();
        addObject(structure14,753,464);
        Structure structure15 = new Structure();
        addObject(structure15,753,426);
        Structure structure16 = new Structure();
        addObject(structure16,753,387);
        Structure structure17 = new Structure();
        addObject(structure17,753,342);
        offground offground4 = new offground();
        addObject(offground4,793,320);
        Structure structure18 = new Structure();
        addObject(structure18,572,323);
        Structure structure19 = new Structure();
        addObject(structure19,572,271);
        Structure structure20 = new Structure();
        addObject(structure20,675,325);
        Structure structure21 = new Structure();
        addObject(structure21,675,265);
        structure19.setLocation(572,266);
        Structure structure22 = new Structure();
        addObject(structure22,572,266);
        offground offground5 = new offground();
        addObject(offground5,618,231);
        Structure structure23 = new Structure();
        addObject(structure23,490,367);
        Structure structure24 = new Structure();
        addObject(structure24,388,368);
        Structure structure25 = new Structure();
        addObject(structure25,388,314);
        Structure structure26 = new Structure();
        addObject(structure26,490,310);
        Structure structure27 = new Structure();
        addObject(structure27,388,263);
        Structure structure28 = new Structure();
        addObject(structure28,490,263);
        Structure structure29 = new Structure();
        addObject(structure29,388,218);
        Structure structure30 = new Structure();
        addObject(structure30,490,212);
        offground offground6 = new offground();
        addObject(offground6,431,171);
        Duke duke = new Duke(34,526);
        addObject(duke,34,526);
        Floater floater = new Floater();
        addObject(floater,219,178);
        endFish endFish = new endFish(1);
        addObject(endFish,213,130);
        healthBar healthBar = new healthBar();
        addObject(healthBar,87,45);
    }
    
    
   public void end(endFish endFish)
   
   {
    if(endFish.numWorld == 2)
    {
       music.stop();
   }
    
}
}
