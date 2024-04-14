import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBomber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBomber extends EnemyAircraft
{
    /**
     * Act - do whatever the EnemyBomber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyBomber (){
    getImage().scale(getImage().getWidth()/20,getImage().getHeight()/20);
    }
}
