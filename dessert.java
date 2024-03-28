import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dessert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dessert extends World
{
    /**
     * Constructor for objects of class dessert.
     * 
     */
    public static int ufosEscaped = 10;
    Bullet bullet;
    Gun gun;
    public dessert()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
    }
    public void act() {
        int score = bullet.ufoShotDown;
        
        int diff = Math.floorDiv(score,10);
        gun.recoilTime = 20 -diff;
        if (Greenfoot.getRandomNumber(100) < Math.max(1,diff)) {
            addObject(new Ufo(), getWidth()-10, Greenfoot.getRandomNumber(getHeight()-200));
        }
        
        if (ufosEscaped <= 0){
            addObject(new GameOver(), 450, 300);
            Greenfoot.stop();
        }
        // GreenfootImage text1 = new GreenfootImage("Lives: "+ufosEscaped, 30, Color.WHITE, new Color(0, 0, 0, 0));
        // showText("Lives: "+ufosEscaped,60,280);
        
    }
    
    public int score(){
        return bullet.ufoShotDown;
    }
    
    public int gunRotation(){
        return gun.getRotation();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ufosEscaped = 10;
        bullet = new Bullet();
        addObject(bullet,450,255);

        gun = new Gun();
        addObject(gun,470,509);
        TextBoard textBoard = new TextBoard();
        addObject(textBoard,819,61);
    }
}
