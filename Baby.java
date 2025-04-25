import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Baby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baby extends Actor
{
    boolean isAtTop = true;
    public void act()
    {
        if (Greenfoot.mouseClicked(null)){
            isAtTop = !isAtTop;
        }
        
        if(isAtTop) {
            setLocation(100, 100);
        } else {
            setLocation(100, 300);
        }
    }
}
