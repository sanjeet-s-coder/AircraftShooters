import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyMedplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyMedplane extends EnemyAircraft{
    /**
     * Act - do whatever the EnemyMedplane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyMedplane (){
    getImage().scale(getImage().getWidth()/15,getImage().getHeight()/15);
    }
}
