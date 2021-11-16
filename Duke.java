import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duke extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private double accel = 1;
    private int jumpStrength = 14;
    private int jtime = 0;
    private boolean jumping;
    private int direction;

    private GreenfootImage player1r = new GreenfootImage("catProtagR.png");
    private GreenfootImage player1l = new GreenfootImage("catProtag.png");
    private GreenfootImage player1JumpR = new GreenfootImage("catdoJumpR.png");
    private GreenfootImage player1JumpL = new GreenfootImage("catdoJumpL.png");
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        checkKeys();
        fall();
        checkFall();
        platformAbove();
        checkFish();
    }
  
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage(player1r);
            direction = 1;
        }

        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage(player1l);
            direction = 2;
        } 

        if (Greenfoot.isKeyDown("right") && jumping == true)
        {

            setImage(player1JumpR);
            direction = 1;
        } 

        if (Greenfoot.isKeyDown("left") && jumping == true)
        {

            setImage(player1JumpL);
            direction = 2;
        } 

        if (Greenfoot.isKeyDown("space") && jumping == false)
        {
            jump();

        } 
    }

    public void moveRight()
    {
        if(collisionAt(speed,-1)) return;

        setLocation (getX() + speed, getY());
    }

    public void moveLeft()
    {
        if(collisionAt(-speed,-1)) return;

        setLocation (getX() - speed, getY());
    }

    public void fall()
    {
        setLocation (getX(), getY() + vSpeed);
        jumping = true;

        if (vSpeed <=9)
        {
            vSpeed = vSpeed += accel;
        }

    }

    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight() / 2 , Platform.class);
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

    public void moveToGround (Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;

        if (direction == 1)
        {
            setImage(player1r);

        }

        if (direction == 2) {
            setImage(player1l);

        }

    }

    
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
     * Checks if there is a platform above you
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
     * Stops jump if there is a platform above you.
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

    public boolean collisionAt (int x ,int y)
    {
        return getOneObjectAtOffset(x,y, Platform.class) != null;

    }
    
    public void checkFish()
    {
        if (isTouching(endFish.class))
        {
            Greenfoot.stop();
            
            
        }
        
        
    }
    
    
}
