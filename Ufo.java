import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends Actor
{
    
    boolean shot = false;
    int shotcountdown = 20;
    int animationCount = 0;
    GreenfootImage bigImage = new GreenfootImage("blastpng.png");
    int w=bigImage.getWidth(), h=bigImage.getHeight();
    int a=8, d=6;
    GreenfootImage[][] smallImages = new GreenfootImage[a][d];
    
    public Ufo(){
        GreenfootImage image = getImage();
        image.scale(70,55);
        for(int x=0; x<a; x++){
            for(int y=0; y<d; y++)
            {
                smallImages[x][y]=new GreenfootImage(w/a, h/d);
                smallImages[x][y].drawImage(bigImage, -x*w/a, -y*h/d);
            }
        }
    }
    /**
     * Act - do whatever the ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-2);
        if (shot){
                playDeadAnimation();
        }
        else if (isAtEdge()){
            dessert.ufosEscaped -= 1;
            
            getWorld().removeObject(this);
        }
        
        // Add your action code here.
    }
    public void playDeadAnimation(){
        int temp = animationCount++;
        if (temp < 48){
            int x = Math.floorDiv(temp,8);
            int y = temp%8;
            setImage(smallImages[y][x]);
            getImage().scale(50,50);
        }
        else{
            getWorld().removeObject(this);
        }
    }
    public void destroy(){
        shot = true;
        turn(-10);
        
        
    }
}
