import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyAircraft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyAircraft extends AirActor
{
    /**
     * Act - do whatever the EnemyAircraft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer eshottimer = new SimpleTimer();
    int movex = 3;
    int movey = 30;
    int shotwait = 3200;
    int shotgap = 8000;
    int Randshot = shotwait + Greenfoot.getRandomNumber(shotgap);
    public void act()
    {
        setLocation(getX()+movex,getY());
        if((getX()>=590)|| (getX()<=10)){
            movex = movex * -1;
            setLocation(getX(),getY()+movey);
        }
        
        if  (eshottimer.millisElapsed() > (shotwait+Randshot)){
            getWorld().addObject(new EnemyBullet(), getX(), getY());
            eshottimer.mark();
         Randshot = Greenfoot.getRandomNumber(shotgap);
        }
        // Add your action code here.
    }
}
