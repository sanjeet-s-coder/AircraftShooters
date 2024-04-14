import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Shots
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet (){
        getImage().scale(getImage().getWidth()/50,getImage().getHeight()/50);
    }
    public void act(){
    setLocation (getX(),getY() - 8);
    EnemyAircraft ea = (EnemyAircraft) getOneIntersectingObject(EnemyAircraft.class);
    if (ea != null){
        getWorld().removeObject(ea);
        Greenfoot.playSound("explosion.mp3");
        MyWorld.score.add(10);
        if(getWorld().getObjects(EnemyAircraft.class).size() == 0){
            Greenfoot.setWorld(new Win());
            Greenfoot.playSound("win.mp3");
        }
        getWorld().removeObject(this);
        
    }
    else if (getY() < 5) {
        getWorld().removeObject(this);
        }
    }
}
