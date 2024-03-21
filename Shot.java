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
        setRotation(rotation-90);
        setImage(new GreenfootImage(10,2));
        getImage().setColor(Color.GREEN);
        getImage().fillRect(0,0,10,2);
    

}
/**
 * Act - do whatever the Shot wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
public void act()
{
    move(4);
    if (isAtEdge()){
        getWorld().removeObject(this);
    }
    // Add your action code here.
}
    
}
