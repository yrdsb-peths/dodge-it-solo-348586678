import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    public void act()
    {
        move(-5);
        
        if(getX() <= 0){
            resetBaby();
        }
        
        if (isTouching(Baby.class)){
            //add a game over symbol
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBaby(){
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0){
            setLocation(600, 100);
        } else {
            setLocation (600, 300);
        }
    }
}
