/**Fish.java
 *
 * Description: A class which can will a graphical fish
 * Library: wheelsunh, awt
 * Date: Sep 16th, 2018
 *
 * @author: Joseph Chang
 */

import wheelsunh.users.*;
import wheelsunh.users.Rectangle;

import java.awt.Color;

public class Fish extends ShapeGroup
{
    //variable that can be modify by user
    protected Color color;

    //The information of the fish's body
    protected Ellipse body = new Ellipse();
    protected Ellipse tail = new Ellipse();
    protected Line line1 = new Line();
    protected Rectangle line2 = new Rectangle();
    protected Line line3 = new Line();
    protected Ellipse upperFin = new Ellipse();
    protected Ellipse upperFin2 = new Ellipse();
    protected Ellipse lowwerFin = new Ellipse();
    protected Ellipse sideFin = new Ellipse();
    protected Ellipse sclera = new Ellipse();
    protected Ellipse anatomy = new Ellipse();
    protected Ellipse pupil = new Ellipse();

    public Fish(int x, int y)
    {
        //constructor with location setting
        //using buildFish method
        color = Color.ORANGE;
        buildFish();
        setLocation(x, y);
    }
    public Fish()
    {
        //non-parameter constructor
        //using buildFish method
        color = Color.ORANGE;
        buildFish();
        setLocation(0, 0);
    }
    public Fish(Color col)
    {
        //constructor with color setting
        //using buildFish method
        color = col;
        buildFish();
        setLocation(0, 0);
    }


    public void setColor(Color col)
    {
        //set fish's body color to col
        //will be called by buildFish
        color = col;
        body.setColor(color);
        tail.setColor(color);
        upperFin.setColor(color);
        upperFin2.setColor(color);
        lowwerFin.setColor(color);
    }
    public void moveDown(int distance)
    {
        //move fish downward if distance is positive
        //using setLocation method

        setLocation(getXLocation(), getYLocation() + distance);
    }

    public Color getColor()
    {
        return color;
    }

    private void buildFish()
    {
        //build the fish when the fish is create
        //will be called by constructor
        //using setLocation method
        //using setColor method


        //fish body
        body.setSize(70, 40);
        body.setLocation(27, 45);
        add(body);

        //fish tail
        tail.setSize(20, 30);
        tail.setRotation(30);
        tail.setLocation(7, 50);
        add(tail);

        //tail lines
        line1.setSize(10, 1);
        line1.setColor(Color.black);
        line1.setRotation(25);
        line1.setLocation(12, 57);
        add(line1);

        line2.setSize(13, 1);
        line2.setColor(Color.black);
        line2.setRotation(13);
        line2.setLocation(7, 63);
        add(line2);

        line3.setSize(9, 1);
        line3.setColor(Color.black);
        line3.setRotation(0);
        line3.setLocation(5, 70);
        add(line3);

        //fish upperFin
        upperFin.setSize(18, 9);
        upperFin.setRotation(15);
        upperFin.setLocation(60, 38);
        add(upperFin);

        //fish upperFin2
        upperFin2.setSize(14, 7);
        upperFin2.setRotation(-10);
        upperFin2.setLocation(42, 41);
        add(upperFin2);

        //fish lowwerFin
        lowwerFin.setSize(18, 9);
        lowwerFin.setRotation(-10);
        lowwerFin.setLocation(47, 84);
        add(lowwerFin);

        //fish sideFin
        sideFin.setSize(26, 13);
        sideFin.setColor(Color.YELLOW);
        sideFin.setRotation(-10);
        sideFin.setLocation(47, 65);
        add(sideFin);

        //fish sclera
        sclera.setSize(15, 15);
        sclera.setColor(Color.white);
        sclera.setLocation(77, 55);
        add(sclera);

        //fish anatomy
        anatomy.setSize(12, 12);
        anatomy.setColor(Color.black);
        anatomy.setLocation(81, 58);
        add(anatomy);

        //fish pupil
        pupil.setSize(5, 5);
        pupil.setColor(Color.white);
        pupil.setLocation(87, 59);
        add(pupil);

        //set location


        //set color
        setColor(color);
    }

    //Main
    public static void main( String[] args )
    {
        new Frame();
        Fish fish1 = new Fish(100,85); //test constructor
        Fish fish2 = new Fish();             //test constructor

        Utilities.sleep(1000);
        fish2.setLocation(300,130);    //test mutator
        Utilities.sleep(500);
        fish2.setColor(Color.GREEN);         //test mutator
        Utilities.sleep(500);
        fish2.moveDown(65);          //test mutator
        Utilities.sleep(500);
        fish2.moveDown(-80);         //test mutator

        Utilities.sleep(1000);
        Fish fish3 = new Fish(Color.BLUE);   //test constructor

        Utilities.sleep(500);
        //test accessors
        TextBox printingText = new TextBox(300,300);
        printingText.setSize(300,400);
        printingText.setText("Information of fish2\nColor: " + fish2.getColor() +
                             "\nX location: " + fish2.getXLocation() +
                             "\nY location: " + fish2.getYLocation());
    }
}
