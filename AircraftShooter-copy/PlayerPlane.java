import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * sho
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPlane extends AirActor
{
    SimpleTimer shottimer = new SimpleTimer();
    /**
     * Act - do whatever the Plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
    public PlayerPlane(){
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
        setRotation(270);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            HorizontialMove(-5);
        }
        if(Greenfoot.isKeyDown("right")){
            HorizontialMove(5);
        }
        if(Greenfoot.isKeyDown("space") && shottimer.millisElapsed()> 500){
            getWorld().addObject(new Bullet(),getX(),getY());
            shottimer.mark();
            Greenfoot.playSound("playershootgood.mp3");
            }
        EnemyAircraft ep = (EnemyAircraft) getOneIntersectingObject(EnemyAircraft.class);
        if(ep != null){
            Greenfoot.playSound("playerexplosion.mp3");
            Greenfoot.setWorld(new Lose());
            Greenfoot.playSound("fail.mp3");
        }
        }
    }


