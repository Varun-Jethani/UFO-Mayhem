import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    public Gun(){
        GreenfootImage image = getImage();
        image.scale(100,100);
    }
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        //use this to get the x position of the mouse.
        int mx = 450;
        int my = 255;
        //use this to get the y position of the mouse.
        if(mouse!=null){
            int buttonNumber = mouse.getButton();
            mx=mouse.getX();
            my=mouse.getY();
            
            // if (buttonNumber == 1){
                // fireShot(); 
            // }
        }
        
        
        setRotation((int)(180*Math.atan2(my-getY(),mx-getX())/Math.PI));
        turn(40);
        
        
        // Add your action code here.
    }
    
     public void fireShot(){
        if( getRotation()>=0  & getRotation()<45  ){
            if(Greenfoot.mousePressed(null )){
            Shot shot = new Shot(getRotation());
            getWorld().addObject(shot,getX(),getY()+30);
             
            }
        }
        else if( getRotation()>=45  & getRotation()<90   ){
            if(Greenfoot.mousePressed(null )){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX(),getY()+55);
             
            }
        }
        else if( getRotation()>=90  & getRotation()<135 ){
            if(Greenfoot.mousePressed(null )){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX()-20,getY());
             
            }
        }
        else if( getRotation()>=135  & getRotation()<180 ){
            if(Greenfoot.mousePressed(null )){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX()-50,getY());
             
            }
        }
        else if( getRotation()>=180  & getRotation()<225   ){
            if(Greenfoot.mousePressed(null)){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX(),getY()-35);
             
            }
        }
        else if( getRotation()>=225  & getRotation()<270   ){
            if(Greenfoot.mousePressed(null)){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX(),getY()-55);
             
            }
        }
        else if( getRotation()>=270  & getRotation()<315   ){
            if(Greenfoot.mousePressed(null)){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX()+25,getY());
             
            }
        }
        else if( getRotation()>=315  & getRotation()<360   ){
            if(Greenfoot.mousePressed(null)){
            Shot shot = new  Shot(getRotation());
            getWorld().addObject(shot,getX()+25,getY()+20);
            }
        }
    }

}
