import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duke extends Actor
{
    private int speed = 6;
    private int vSpeed = 0;
    private double accel = 1;
    private int jumpStrength = 15;
    private int jtime = 0;
    private boolean jumping;
    private int direction;

    private GreenfootImage player1r = new GreenfootImage("catProtagR.png");
    private GreenfootImage player1l = new GreenfootImage("catProtag.png");
    private GreenfootImage player1JumpR = new GreenfootImage("catdoJumpR.png");
    private GreenfootImage player1JumpL = new GreenfootImage("catdoJumpL.png");

    private GreenfootImage catRunL1 = new GreenfootImage("RunL1.png");    
    private GreenfootImage catRunL2 = new GreenfootImage("RunL2.png");  
    private GreenfootImage catRunL3 = new GreenfootImage("RunL3.png");  
    private GreenfootImage catRunL4 = new GreenfootImage("RunL4.png");  
    private GreenfootImage catRunL5 = new GreenfootImage("RunL5.png");  

    private GreenfootImage catRunR1 = new GreenfootImage("RunR1.png");    
    private GreenfootImage catRunR2 = new GreenfootImage("RunR2.png");  
    private GreenfootImage catRunR3 = new GreenfootImage("RunR3.png");  
    private GreenfootImage catRunR4 = new GreenfootImage("RunR4.png");  
    private GreenfootImage catRunR5 = new GreenfootImage("RunR5.png");

    private int frame = 1;
    private int animationCounter = 0;
    private int numLives = 3;
    int xPos;
    int yPos;    
    int numWorld;

    /**
     * Constructor for objects of class Duke
     * 
     */
    public Duke(int xVar, int yVar, int worldNum)
    {
        xPos = xVar;
        yPos = yVar;
        numWorld = worldNum;
    }

    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkforSpikes();
        fall();
        checkFall();
        platformAbove();
        animationCounter++;
    }

    /**
     * 
     * Checks if the left, right or space button is being pressed and if jumping is true.
     * Sets direction and movement
     */
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            direction = 1;
        }

        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            direction = 2;
        } 

        if (Greenfoot.isKeyDown("right") && jumping == true)
        {

            direction = 1;
        } 

        if (Greenfoot.isKeyDown("left") && jumping == true)
        {

            direction = 2;
        } 

        if (Greenfoot.isKeyDown("space") && jumping == false)
        {
            jump();

            if (direction == 1)
            {
                setImage(catRunR2);
            }
            if (direction == 2)
            {
                setImage(catRunL2);
            }

        } 
    }

    /**
     * Checks if there will be a collision ahead of it,  if not move rigt and start animation
     * 
     */
    public void moveRight()
    {
        if(collisionAt(speed,-1)) return;

        setLocation (getX() + speed, getY());
        if (animationCounter % 4 == 0)
        {
            animateRight();
        }
    }

    /**
     * Animates to frames while moving right
     * 
     */
    public void animateRight()
    {
        switch (frame)
        {
            case 1:
                setImage(catRunR1);
                break;

            case 2:
                setImage(catRunR2);
                break;

            case 3:
                setImage(catRunR3);
                break;

            case 4:
                setImage(catRunR4);
                break;

            case 5:
                setImage(catRunR5);
                frame = 1;
                break;

        }
        frame++;
    }

    /**
     * Checks if there is a collision in front. If not, change position to move left.
     * 
     */
    public void moveLeft()
    {
        if(collisionAt(-speed,-1)) return;

        setLocation (getX() - speed, getY());

        if (animationCounter % 4 == 0)
        {
            animateLeft();
        }
    }

    /**
     * Changes animation frames that are facing left.
     * 
     */
    public void animateLeft()
    {
        switch (frame)
        {
            case 1:
                setImage(catRunL1);
                break;

            case 2:
                setImage(catRunL2);
                break;

            case 3:
                setImage(catRunL3);
                break;

            case 4:
                setImage(catRunL4);
                break;

            case 5:
                setImage(catRunL5);
                frame = 1;
                break;

        }
        frame++;
    }

    /**
     * If there is  not a platform under, move down at vspeed plus acceleration
     * 
     */
    public void fall()
    {

        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        jumping = true;

        if (vSpeed <=6)
        {
            vSpeed = vSpeed += accel;
        }
    }

    /**
     * Gets the width and height of sprite. Checks if a platform is under. If no platform, then
     * Jumping, if true on ground.
     * 
     */
    public boolean onGround()
    {
        double spriteHeight = getImage().getHeight();
        double spriteWidth = getImage().getHeight();
        double yDistance = (double)(spriteHeight/2) + 5;

        Actor  ground = getOneObjectAtOffset(getImage().getWidth() + 1 / 5, getImage().getHeight() / 2 , Platform.class);

        if (direction == 1)
        {
            ground = getOneObjectAtOffset(-20, getImage().getHeight() / 2 , Platform.class);

        }
        if (direction == 2)
        {
            ground = getOneObjectAtOffset(getImage().getWidth() - 9, getImage().getHeight() / 2 , Platform.class);
        }

        if (ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }

    }

    /**
     * 
     * Will check if platform under at a length of vspeed. If platform detected, lower speed.
     */
    public void detectPlatform()
    {
        for (int i = 0; i < vSpeed; i++ )
        {
            Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2 + i , Platform.class);
            if(under != null)
            {
                vSpeed = i;

            }
        }

    }

    /**
     * Moves player to ground if ground is detected and corrects players direction.
     * 
     */
    public void moveToGround (Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
        if (direction == 1 && Greenfoot.isKeyDown("right") != true)
        {
            setImage(player1r);

        }

        if (direction == 2 && Greenfoot.isKeyDown("left") != true){
            setImage(player1l);

        }

    }

    /**
     * Checks if player should be falling
     * 
     */
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;

        }
        else
        {
            fall();

        }
    }

    /**
     * Moves player upward depending on jump strength.
     * 
     */
    public void jump()
    {
        if (jtime == 3 )
        {
            vSpeed = -jumpStrength;
            fall();
            jtime = 0;
        }
        else
        {

            jtime++;
        }

    }

    /**
     * 
     * Puts point on top of sprite, if a ceiling is there, decrease speed and Activate bop head
     *  Code basics from awesomeinmyworld on greenfoot
     * 
     */
    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor ceiling = getOneObjectAtOffset(0,yDistance, Platform.class);
        if (ceiling != null)
        {
            vSpeed = 1;
            bopHead(ceiling);
            return true;

        }
        else
        {
            return false; 

        }

    }

    /**
     * Stops jump if there is a platform above you. Corrects where player should be
     * 
     *  Code basics from awesomeinmyworld on greenfoot
     * 
     */    
    public void bopHead(Actor ceiling)
    {
        int ceilingHeight = ceiling.getImage().getHeight();
        int newY = ceiling.getY() + (ceilingHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }

    /**
     * 
     * Checks if there is an object at offset of player.
     */
    public boolean collisionAt (int x ,int y)
    {
        return getOneObjectAtOffset(x,y, Platform.class) != null;

    }

    /**
     * 
     * Checks if spikes are being touched. If so, Activate that worlds damage and set position.
     */
    public void checkforSpikes() {
        if (isTouching(Spike.class)){

            if (numWorld ==2)
            {
                Level2 Level2= (Level2) getWorld();
                Level2.damage();
            }
            if (numWorld ==3)
            {
                Level3 Level3 = (Level3) getWorld();
                Level3.damage();
            }
            if (numWorld ==4)
            {
                Level4 Level4 = (Level4) getWorld();
                Level4.damage();
            }
            if (numWorld ==5)
            {
                Level5 Level5 = (Level5) getWorld();
                Level5.damage();
            }

            numLives--;
            setLocation(xPos, yPos);

        }
    }
}