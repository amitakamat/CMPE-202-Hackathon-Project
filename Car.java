import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    public Car()
    {
      GreenfootImage image = getImage() ;
      image.scale( 400,200) ;
    }
    public void act() 
    {
        move();
    } 
    
    public void move()
    {
        while(getX() >= 750)
        {
            Greenfoot.delay(1);
            setLocation(getX()- 3, getY()); // move
            if(getX() < 750)
            {
                Greenfoot.delay(60);
                GreenfootImage gi = new GreenfootImage("car.jpeg");
                gi.scale( 400,200) ;
                setImage(gi);
            }
        }
    }   
}
