/**FatFish.java
 *
 * Description: A FatFish class inherited from fish class
 * Library: wheelsunh, awt, lang
 * Date: Sep 16th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;

import java.awt.*;
import java.lang.*;

public class FatFish extends Fish
{
    //constructor
    public FatFish()
    {
        super();
        modifyFish();
        setColor(Color.GREEN);
    }

    //constructor
    public FatFish(int x, int y)
    {
        super();
        modifyFish();
        setColor(Color.GREEN);
        setLocation(x,y);
    }

    //constructor
    public FatFish(Color col)
    {
        super();
        modifyFish();
        setColor(col);
    }

    //The default setting of fat fish
    public void modifyFish()
    {
        body.setSize(70,60);
        body.setLocation(20,5);

        lowwerFin.setLocation(46,63);
    }

    //let fat fish flash
    public void flashAni(int t)
    {
        Color col = color;
        for(int i = 0; i < t; i+=200)
        {
            Utilities.sleep(100);
            setColor(Color.WHITE);
            line1.setColor(Color.WHITE);
            line2.setColor(Color.WHITE);
            line3.setColor(Color.WHITE);
            sideFin.setColor(Color.WHITE);
            anatomy.setColor(Color.WHITE);

            Utilities.sleep(100);
            setColor(col);
            line1.setColor(Color.BLACK);
            line2.setColor(Color.BLACK);
            line3.setColor(Color.BLACK);
            sideFin.setColor(Color.YELLOW);
            anatomy.setColor(Color.BLACK);
        }
    }

    //let fat fish swim forward up and down
    public void moveSineFunction(int t)
    {
        double dy;
        int oriY = getYLocation();
        double rad;
        for(int i = 0; i < t; i+=10)
        {
            Utilities.sleep(10);
            rad = (double)i/100.0;
            dy = 30*Math.sin(rad);
            setLocation(getXLocation()+3,oriY+(int)dy);
        }
    }

    public static void main( String[] args )
    {
        new Frame();
        FatFish fatFish = new FatFish();
        fatFish.setLocation(100,100);

        fatFish.moveSineFunction(1000);
        fatFish.flashAni(2000);
    }
}
