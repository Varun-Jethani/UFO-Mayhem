import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBoard extends Actor
{   
    /**
     * Act - do whatever the TextBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage img = new GreenfootImage(250,250);
                
        GreenfootImage text1 = new GreenfootImage("Lives: "+dessert.ufosEscaped , 30, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage text2 = new GreenfootImage("Score: "+((dessert)getWorld()).score(), 30, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage text3 = new GreenfootImage("BEST: "+0,30,Color.WHITE, new Color(0, 0, 0, 0));
        img.drawImage(text1, (250 - text1.getWidth() )/ 2, 100);
        img.drawImage(text2, (250 - text2.getWidth() )/ 2, 140);
        img.drawImage(text3, (250 - text3.getWidth() )/ 2, 180); 
        setImage(img);

        // Add your action code here.
    }
}
