import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */public class Shots extends AirActor
{
    /**
     * Act - do whatever the Shots wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int StepSize = 5;
    private int stepsize;
    
    public Shots(){
        this(StepSize);
    }
    public Shots (int stepsize){
    this.stepsize = stepsize;
    }
    public void act()
    {
        VerticalMove(stepsize);
        if(outofBounds()){
        getWorld().removeObject(this);
        }
    }
    public boolean outofBounds(){
    return getY()<StepSize;
    }
}
