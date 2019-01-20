/**FlyingFish.java
 *
 * Description: A FlyingFish class inherited from fish class
 * Library: wheelsunh, awt, lang
 * Date: Sep 16th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;
import java.lang.*;

import java.awt.*;

public class FlyingFish extends Fish
{

    //constructor
    public FlyingFish()
    {
        super();
        modifyFish();
        color = Color.BLUE;
        setColor(color);
    }

    //constructor
    public FlyingFish(int x, int y)
    {
        super();
        modifyFish();
        color = Color.BLUE;
        setColor(color);
        setLocation(x,y);
    }

    //constructor
    public FlyingFish(Color col)
    {
        super();
        modifyFish();
        color = col;
        setColor(col);
    }

    //default setting of flying fish
    private void modifyFish()
    {
        body.setSize(80,25);
        body.setLocation(15,14);

        upperFin.setLocation(25, 27);
        upperFin.setRotation(13);
        upperFin.setSize(18,14);

        upperFin2.setSize(20,10);
        upperFin2.setLocation(20,7);
        upperFin2.setRotation(30);

        lowwerFin.setRotation(-45);
        lowwerFin.setLocation(43,40);

        sideFin.setSize(45,12);
        sideFin.setRotation(46);
        sideFin.setLocation(26,5);
        sideFin.setColor(Color.CYAN);

    }

    //let flying fish flap the wing
    public void moveWings(int t)
    {
        for(int i = 0; i < t; i += 180)
        {
            int a = 45;
            double rad;
            double x, y;
            int iX, iY;
            while(a < 60)
            {
                Utilities.sleep(3);
                rad = Math.toRadians((double)a);
                x = 23.0*Math.cos(rad);
                y = 23.0*Math.sin(rad);
                iX = (int)x;
                iY = (int)y;
                sideFin.setRotation(a);
                sideFin.setLocation(getXLocation()+26+16-iX, getYLocation()+5+16-iY);
                a++;
            }
            while(a > 15)
            {
                Utilities.sleep(3);
                rad = Math.toRadians((double)a);
                x = 23.0*Math.cos(rad);
                y = 23.0*Math.sin(rad);
                iX = (int)x;
                iY = (int)y;
                sideFin.setRotation(a);
                sideFin.setLocation(getXLocation()+26+16-iX, getYLocation()+5+16-iY);
                a--;
            }
            while(a < 45)
            {
                Utilities.sleep(3);
                rad = Math.toRadians((double)a);
                x = 23.0*Math.cos(rad);
                y = 23.0*Math.sin(rad);
                iX = (int)x;
                iY = (int)y;
                sideFin.setRotation(a);
                sideFin.setLocation(getXLocation()+26+16-iX, getYLocation()+5+16-iY);
                a++;
            }
        }
    }

    //let flying fish swim forward
    public void moveFowardAni(int t)
    {
        for(int i = 0; i < t; i+=10)
        {
            Utilities.sleep(10);
            setLocation(getXLocation() + 3, getYLocation());
        }
    }

    public static void main( String[] args )
    {
        new Frame();
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.setLocation(100,100);

        flyingFish.moveFowardAni(1000);
        flyingFish.moveWings(3600);
    }
}
