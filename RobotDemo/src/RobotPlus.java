import robot.*;
import java.awt.Color;

/** RobotPlus Class
  * A new class which is an extension of the Robot class
  * @author Ridout and ...
  * @version July 2002
 */

public class RobotPlus extends Robot
{
    /** RobotPlus Constructor
      * Creates a new RobotPlus robot with the given name and colour
      * @param name   The name of the robot
      * @param colour The colour of the robot's body
     */

    public RobotPlus (String name, Color colour)
    {
	// Calls the original Robot class constructor
	super (name, colour);
    }


    // New methods for the RobotPlus class

    /** Turns the robot around (180 degrees)
      */
    public void turnAround ()
    {
	turnLeft ();
	turnLeft ();
    }


    /** Moves the Robot the given number of steps
      * @param noOfSteps The number of steps to move the Robot
      */
    public void move (int noOfSteps)
    {
	for (int steps = 1 ; steps <= noOfSteps ; steps++)
	    this.move ();
    }
}
