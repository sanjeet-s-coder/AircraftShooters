import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Shots
{
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public EnemyBullet(){
    getImage().scale(getImage().getWidth()/15,getImage().getHeight()/15);
    }
    
    public void act(){
        setLocation(getX(), getY() + 5);
        
        PlayerPlane pp = (PlayerPlane) getOneIntersectingObject(PlayerPlane.class);
        if (pp != null){
            MyWorld.lives.add(-1);
            if (MyWorld.lives.getValue()==0){
                getWorld().removeObject(pp);
                Greenfoot.playSound("playerexplosion.mp3");
                Greenfoot.setWorld(new Lose());
                Greenfoot.playSound("fail.mp3");
            }
            getWorld().removeObject(this);
        
        }
        else if (getY() > 390) {
        getWorld().removeObject(this);
        }   
    }
    
}
