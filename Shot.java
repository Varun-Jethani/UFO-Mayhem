import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shot extends Actor
{
    public Shot(int rotation){
        setRotation(rotation-35);
        // setImage(new GreenfootImage(10,2));
        // getImage().setColor(Color.GREEN);
        // getImage().fillRect(0,0,10,2);
        getImage().scale(20,6);
    

}
/**
 * Act - do whatever the Shot wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
public void act()
{
    move(7);
    takeDownUfo();
    
    // Add your action code here.
}

public void takeDownUfo(){
    if (isTouching(Ufo.class)){
        
        
        Ufo shotUfo = (Ufo)getOneIntersectingObject(Ufo.class);
        if (!shotUfo.shot){
            shotUfo.destroy();
            Greenfoot.playSound("Laser Gun.wav");
            ((dessert)getWorld()).bullet.ufoShotDown += 1;
            getWorld().removeObject(this);
        }
        
    }
    else if (isAtEdge()){
        getWorld().removeObject(this);
    }
}
    
}
