import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyPlanes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyPlanes extends EnemyAircraft
{
    /**
     * Act - do whatever the EnemyPlanes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyPlanes(){
        getImage().scale(getImage().getWidth()/20,getImage().getHeight()/20);
        setRotation(180);
    }
}

