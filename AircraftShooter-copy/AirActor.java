import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AirActor extends Actor
{
    /**
     * Act - do whatever the SpaceActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void VerticalMove(int stepsize)
    {
        setLocation(getX(),getY()+stepsize);
    }
    public void HorizontialMove(int stepsize)
    {
        setLocation(getX()+stepsize,getY());
    }
}
