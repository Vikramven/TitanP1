package GenBody;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Body {
    /*so we are gonna need some global variables that define the parameters of the body of the spaceship
    such as name, mass,color etc
    idk how many we need tho and whether stuff like colour is important but i think it prob is
    Vikram
     */
    //so this is just copied from what I wrote from the Data body class
    public String BName;//name of the body, like in general, we have spaceship defined in another class
    public double Radius;
    public double mass;
    public Vector position;//is of type Vector class, which was created drawing from the interface provided in API
    public Vector Velocity;//same thing I guess
    public Color BColor;

    /*now we have to create methods that simply return all of the above
    Vikram
     */

    public double getRadius(){
        return Radius;
    }
    public double getMass(){
        return mass;
    }
    public Vector getVelocity(){
        return Velocity;
    }
    public Vector getPosition(){
        return position;
    }
    //Constructor- Sahil
    public Body(){

    }
    /*now we need a few more methods but idk what they are
    Both Vikram and Sahil will work on this method
     */



}
