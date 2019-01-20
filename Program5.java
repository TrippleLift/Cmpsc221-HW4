/**Program5.java
 *
 * Description: A testing driver built to test Fish.java,
 *              FlyingFish.java, and FatFish.java
 * Library: wheelsunh
 * Date: Sep 16th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.Frame;
import wheelsunh.users.Utilities;

public class Program5
{
    public static void main( String[] args )
    {
        new Frame();

        //test fish class
        Fish fish = new Fish(400,50);
        for (int i = 0; i < 1000; i+=10)
        {
            fish.moveDown(3);
            Utilities.sleep(10);
        }

        //test flying fish class
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.setLocation(100,250);
        Utilities.sleep(300);
        flyingFish.moveFowardAni(1000);
        flyingFish.moveWings(900);

        //test fat fish class
        FatFish fatFish = new FatFish(100,100);
        fatFish.moveSineFunction(1000);
        fatFish.flashAni(2000);
    }
}
