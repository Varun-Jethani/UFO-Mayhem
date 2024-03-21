import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int ufoShotDown = 0;
    int ufosEscaped = 0;
    public Bullet(){
        GreenfootImage image = getImage();
        image.scale(10,10);
    }
    
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //use this to get the x position of the mouse.
        
        //use this to get the y position of the mouse.
        if(mouse!=null){
            int buttonNumber = mouse.getButton();
            setLocation(mouse.getX(),mouse.getY());
            /*if (isTouching(Ufo.class)){
                if(Greenfoot.mousePressed(this)){
                    Greenfoot.playSound("Laser Gun.wav");
                    removeTouching(Ufo.class);
                    
                    ufoShotDown += 1;
                }        
            }*/
            
        }
        if(Greenfoot.mousePressed(this)){
            List<Ufo> ufos = getObjectsInRange(55,Ufo.class);
            if (ufos!=null){
                for (Ufo ufo : ufos){
                    ((Ufo)ufo).destroy();
                    Greenfoot.playSound("Laser Gun.wav");
                    ufoShotDown += 1;
                }
            
            }
        }
        showScores();
        
          
        // Add your action code here.
    }
    
    private void showScores()
    {
        getWorld().showText("Score: "+ufoShotDown, 60, 260);
        
    }
    
    
}
