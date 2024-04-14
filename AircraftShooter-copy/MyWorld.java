
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Counter lives = new Counter();
    public static Counter score = new Counter();
    private int enemycounter = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        PlayerPlane pplane = new PlayerPlane();
        addObject(pplane,320,350);
        addObject(lives, 50, 380);
        addObject(score, 550, 380);
        lives.setValue(3);
        score.setValue(0);
        for(int i = 0; i<8; i++){
            addObject(new EnemyPlanes(),35 + 75*i,200);
            addObject(new EnemyMedplane(), 35 + 75*i,120);
            addObject(new EnemyBomber(), 35 + 75*i,40);
        }
    }
}
